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
    CategoryRooms c1=new CategoryRooms();
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
        System.out.println("\n\tRoom Speciality: ");
        //single , double triple , Queen sized, king sized , twin , hollywood twin room , double double , studio , Suite , Presidential suite
        System.out.println("\n\t1]Single Room\n\t2]Double Room\n\t3]Triple Room\n\t4]Queen Sized\n\t5]King Sized\n\t6]Twin\n\t7]Hollywood Twin Room\n\t8]Double-Double\n\t9]Studio Room\n\tt10]Suite ");
        System.out.println("\n\tEnter Your Choice:");
        switch(sc.nextInt()){
            case 1:{
                r1.setSpeciality("Single");
                break;
            }
            case 2:{
                r1.setSpeciality("Double");
                break;
            }
            case 3:{
                r1.setSpeciality("Triple");
                break;
            }
            case 4:{
                r1.setSpeciality("Queen Sized");
                break;
            }
            case 5:{
                r1.setSpeciality("King Sized");
                break;
            }
            case 6:{
                r1.setSpeciality("Twin");
                break;
            }
            case 7:{
                r1.setSpeciality("Hollywood Twin");
                break;
            }
            case 8:{
                r1.setSpeciality("Double-Double");
                break;
            }
            case 9:{
                r1.setSpeciality("Studio");
                break;
            }
            case 10:{
                r1.setSpeciality("Suite");
                break;
            }
        }


        return r1;
    }

    //add room

    public void addRoom() throws IOException {
        CategoryRooms temp=a1.searchCategory();
        Room r=data(temp.getPrice());
        temp.getLst().add(r);
        System.out.println("\n\tRoom added successfully to the particular Category :");
    }


    //deleteroom
    public void deleteRoom() throws IOException {
        CategoryRooms temp=a1.searchCategory();
        for (int i=0;i<temp.getLst().size();i++) {
            System.out.println();
        }
        Room temp_room=search();
        temp.getLst().remove(temp_room);
    }


    public Room search(){
        Room r1 = null;
        CategoryRooms temp=a1.searchCategory();
        System.out.println("\n\tEnter the room id you want to search:");
        int search_id=sc.nextInt();
        int flag=0;
        for(int i=0;i<temp.getLst().size();i++){
            if(temp.getLst().get(i).getrId()==search_id){
                System.out.println("\n\tData Found"+temp.getLst().get(i).getrId()+" at "+temp.getLst().get(i)+" position");
                flag=1;
                r1=temp.getLst().get(i);
                break;
            }
        }
        if(flag==0){
            System.out.println("\n\tRoom Not Found!");
        }
        return r1;
    }
    public void display_rooms(){
    CategoryRooms temp=a1.searchCategory();
        for (int i=0;i<temp.getLst().size();i++){
            Room r1=temp.getLst().get(i);
            System.out.println(r1);
        }
    }

    //update room details
    public void updateRoom() throws IOException {

       /* if(temp.getLst().size()>0){
            System.out.println("Selected room Category:"+r.toString());
            System.out.println("Choose the Data to Update of the selected room:");
//      int rId, String uniqueId, int rating, int beds, String usageStatus, boolean isAC, String speciality, String description
            System.out.println("Enter the Room ID of the room to Update:");
            int index_roomid=sc.nextInt();
//             index=search();*/
//            if(index!=-1)
        CategoryRooms temp=a1.searchCategory();
        System.out.println("\n\tSelected Category Type: "+temp.getLst().toString());
        Room temp_room=search();
        System.out.println("\n\tSelected Room Details :"+temp_room.toString());
        do{
//                Room r1=temp.getLst().get(index);
            System.out.println("\n\t1]Rating\n\t2]No of Beds\n\t3]Room is Ac or not\n\t4]speciality\n\t");
            System.out.println("\n\tEnter your Choice:");
            switch(sc.nextInt()) {
                case 1: {
                    System.out.println("\n\tEnter Rating:");
                    int temp_rating = sc.nextInt();
                    temp_room.setRating(temp_rating);
                    break;
                }
                case 2: {
                    System.out.println("\n\tEnter No. of beds ::");
                    int temp_beds = sc.nextInt();
                    temp_room.setBeds(temp_beds);
                    break;
                }
                case 3: {
                    System.out.println("Enter the if it is Ac Or Not:");
                    boolean temp_isAc = sc.nextBoolean();
                    temp_room.setAC(temp_isAc);
                    break;
                }
                case 4: {
                    System.out.println("Enter the speciality : ");
                    System.out.println("\n\t1]Single Room\n\t2]Double Room\n\t3]Triple Room\n\t4]Queen Sized\n\t5]King Sized\n\t6]Twin\n\t7]Hollywood Twin Room\n\t8]Double-Double\n\t9]Studio Room\n\tt10]Suite ");
                    System.out.println("\n\tEnter Your Choice:");
                    switch (sc.nextInt()) {
                        case 1: {
                            temp_room.setSpeciality("Single");
                            break;
                        }
                        case 2: {
                            temp_room.setSpeciality("Double");
                            break;
                        }
                        case 3: {
                            temp_room.setSpeciality("Triple");
                            break;
                        }
                        case 4: {
                            temp_room.setSpeciality("Queen Sized");
                            break;
                        }
                        case 5: {
                            temp_room.setSpeciality("King Sized");
                            break;
                        }
                        case 6: {
                            temp_room.setSpeciality("Twin");
                            break;
                        }
                        case 7: {
                            temp_room.setSpeciality("Hollywood Twin");
                            break;
                        }
                        case 8: {
                            temp_room.setSpeciality("Double-Double");
                            break;
                        }
                        case 9: {
                            temp_room.setSpeciality("Studio");
                            break;
                        }
                        case 10: {
                            temp_room.setSpeciality("Suite");
                            break;
                        }

                        //set
                    }
                }
                break;
            }
        }while (sc.nextInt()==1);
    }

}
