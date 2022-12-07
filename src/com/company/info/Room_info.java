package com.company.info;

import com.company.model.CategoryRooms;
import com.company.model.Room;

import java.sql.SQLOutput;
import java.util.*;
import java.io.*;
public class Room_info {
    Scanner sc=new Scanner(System.in);
    InputStreamReader ir=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(ir);
    //data
    public Room data(double price) throws IOException {


        Room r=new Room();
        //take info
//      int rId, String uniqueId, int rating, int beds, String usageStatus, boolean isAC, String speciality, String description)
        System.out.println("Enter the Room ID: ");
        r.setrId(sc.nextInt());
        System.out.println("Enter the Unique ID of the room:");
        r.setUniqueId(br.readLine());
//        System.out.println("Enter the Rating of the room:");
//        r.setRating(sc.nextInt());
//        System.out.println("Enter the No of beds in the room:");
//        r.setBeds(sc.nextInt());
//        System.out.println("Enter the Usage Status of the room")

        return r;
    }

    //add room

    public void addRoom() throws IOException {
        Admin_info a1=new Admin_info();
        CategoryRooms temp=a1.searchCategory();
        Room r=data(temp.getPrice());
        temp.getLst().add(r);
    }


    //deleteroom
    public void deleteRoom() throws IOException {
        Admin_info a1=new Admin_info();
        CategoryRooms temp=a1.searchCategory();
        Room r=data(temp.getPrice());
        System.out.println("Selected room category:"+r.toString());
        System.out.println("Enter the Room ID of the room to be Deleted");
        int index_roomid=sc.nextInt();
        temp.getLst().remove(index_roomid);
        System.out.println("***Room of the corresponding category deleted***");
    }

    //update room details
    public void updateRoom() throws IOException {
        Admin_info a1=new Admin_info();
        CategoryRooms temp=new CategoryRooms();
        Room r=data(temp.getPrice());
        System.out.println("Selected room Category:"+r.toString());
        System.out.println("Choose the Data to Update of the selected room:");
//      int rId, String uniqueId, int rating, int beds, String usageStatus, boolean isAC, String speciality, String description
        System.out.println("\n\t1]Room ID\n\t2]Unique ID\n\t3]Rating\n\t4]No of Beds\n\t5]Room is Ac or not:");
        System.out.println("\n\tEnter your Choice:");
        switch(sc.nextInt()){
            case 1:{
                System.out.println("Enter the Room ID of the room to Update:");
                int index_roomid=sc.nextInt();
                System.out.println("\n\tEnter new Room ID:");
                int new_roomid=sc.nextInt();
                temp.getLst().set(index_roomid,temp.getLst().get(new_roomid));
            }
            case 2:{
                System.out.println("\n\tEnter the Room Unique ID to Update:");
                int index_roomUniqueid=sc.nextInt();
                System.out.println("\n\tEnter new Room Unique ID:");
                String new_roomUniqueid=br.readLine();
                temp.getLst().set(index_roomUniqueid,temp.getLst().get(Integer.parseInt(new_roomUniqueid)));
            }
            case 3:{
                System.out.println("\n\tEnter the Rating of the Room:");
                int index_rating=sc.nextInt();
                System.out.println("\n\tEnter new Rating of the Room:");
                int new_roomRating=sc.nextInt();
                temp.getLst().set(index_rating,temp.getLst().get(index_rating));

            }
        }
    }

}
