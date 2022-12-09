package com.company.info;
import com.company.model.CategoryRooms;
import com.company.model.Room;
import java.util.*;
import java.io.*;
public class Room_info {
    Scanner sc=new Scanner(System.in);
    InputStreamReader ir=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(ir);
    Admin_info a1=new Admin_info();
    //data
    public Room data(double price) throws IOException {
        Room r1 = new Room();
        System.out.println("Enter the Room Id:");
        int temp_id = sc.nextInt();
        r1.setrId(temp_id);
        System.out.println("Enter the Room Unique Id:");
        String temp_uniqueid = br.readLine();
        r1.setUniqueId(temp_uniqueid);
        System.out.println("Enter the Rating of the Room:");
        int temp_rating = sc.nextInt();
        r1.setRating(temp_rating);
        System.out.println("Enter the Number of the Beds:");
        int temp_beds = sc.nextInt();
        r1.setBeds(temp_beds);
        System.out.println("Enter the if it is Ac Or Not:");
        boolean temp_isAc = sc.nextBoolean();
        r1.setAC(temp_isAc);
        //enter speciality

        return r1;
    }

    //add room

    public void addRoom() throws IOException {
        CategoryRooms temp=a1.searchCategory();
        Room r=data(temp.getPrice());
        temp.getLst().add(r);
    }


    //deleteroom
    public void deleteRoom() throws IOException {
        CategoryRooms temp=a1.searchCategory();
        if(temp.getLst().size()>0){
            Room r=temp.getLst().get(0);
            System.out.println("Selected room category:"+r);

            System.out.println("Enter the Room ID of the room to be Deleted");
            int index_roomid=sc.nextInt();

            temp.getLst().remove(index_roomid);
            System.out.println("***Room of the corresponding category deleted***");
        }
        else{
            System.out.println("****No rooms to be deleted****");
        }
    }


    public int search(List<Room> lst,int id){
        for(int i=0;i<lst.size();i++){
            if(lst.get(i).getrId()==id){
                return i;
            }
        }
        return -1;
    }
    //update room details
    public void updateRoom() throws IOException {
        CategoryRooms temp=new CategoryRooms();
        if(temp.getLst().size()>0){
            Room r=temp.getLst().get(0);
            System.out.println("Selected room Category:"+r.toString());
            System.out.println("Choose the Data to Update of the selected room:");
//      int rId, String uniqueId, int rating, int beds, String usageStatus, boolean isAC, String speciality, String description
            System.out.println("Enter the Room ID of the room to Update:");
            int index_roomid=sc.nextInt();
            int index=search(temp.getLst(),index_roomid);
            if(index!=-1)
            {
                Room r1=temp.getLst().get(index);
                System.out.println("\n\t1]Rating\n\t2]No of Beds\n\t3]Room is Ac or not\n\t4]speciality\n\t");
                System.out.println("\n\tEnter your Choice:");
                switch(sc.nextInt()){
                    case 1:{
                        System.out.println("\n\tEnter Rating:");
                        int index_rating=sc.nextInt();
                        r1.setRating(index_rating);
                        break;
                    }
                    case 2:{
                        System.out.println("\n\tEnter No. of beds ::");
                        int index_beds=sc.nextInt();
                        r1.setBeds(index_beds);
                        break;
                    }
                    case 3:{
                        System.out.println("Enter the if it is Ac Or Not:");
                        boolean temp_isAc = sc.nextBoolean();
                        r1.setAC(temp_isAc);
                        break;
                    }
                    case 4:{
                        System.out.println("Enter the speciality :: ");
                        //set
                    }
                }
            }
            else {
                System.out.println("No Room with this ID exists!!!");
            }
        }

    }

}
