package com.company.info;
import java.util.*;
import java.io.*;
import com.company.model.CategoryRooms;
import com.company.model.Customer;
import com.company.model.Pair;
import com.company.model.Room;

import java.util.LinkedList;
import java.util.List;

public class Receiptionist_info {
    List<Double> lst;
    InputStreamReader ir=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(ir);
    Scanner sc=new Scanner(System.in);
    List<Room> lrooms;
    Customer c1=new Customer();
    //get data all room type // category

    public void inorder(CategoryRooms root){
        if (root!=null) {
            inorder(root.getLeft());
            if(root.getLst().size()>0){

                    lrooms.add(root.getLst().get(root.getLst().size()-1));

            }
            inorder(root.getRight());
        }
    }
        List<CategoryRooms> lst1;
    public void inorderRange(CategoryRooms root,int a,int b){
        if (root!=null) {
            inorderRange(root.getLeft(),a,b);
            if(root.getPrice()>=a && root.getPrice()<=b) {
                lst1.add(root);
            }
            inorderRange(root.getRight(),a,b);
        }
    }

    public void getCategoryRoom(CategoryRooms root){
        lrooms=new LinkedList<>();
        inorder(root);
        System.out.println("----------------Rooms--------------------");
        for(int i=0;i<lrooms.size();i++){
            System.out.println(lrooms.get(i));
        }
    }
    public Room bookRoomforCustomer(Room room,List<Customer> lst) throws IOException {
        Customer temp=Customer_info.customerInfo();
        lst.add(temp);
        room.setC(temp);
        room.setUsageStatus(true);
        temp.getLst().add(room);
        System.out.println("Room Booked : ");
        //display the booking details
        System.out.println(room);
        return room;
//        getting booked price for bill payment..
    }
    public Room searchRoomForCustomer(CategoryRooms root,Pair p){
        lst1=new LinkedList<>();
        inorderRange(root,p.getA(),p.getB());
        System.out.println(lst1);
        System.out.println("Enter choice \n1-Low to High \n2-High to low");
        int c=sc.nextInt();
        Room r1=null;
        System.out.println(lst1);
        if(c==1){
            for(int i=0;i<lst1.size();i++){
                List<Room> lstr=lst1.get(i).getLst();
                for(int j=0;j<lstr.size();j++){
                    if(!lstr.get(j).isUsageStatus()){
                        r1=lstr.get(j);
                        break;
                    }
                }
            }
        }
        else{
            for(int i=lst1.size()-1;i>=0;i--){
                List<Room> lstr=lst1.get(i).getLst();
                for(int j=0;j<lstr.size();j++){
                    if(!lstr.get(j).isUsageStatus()){
                        r1=lstr.get(j);
                        break;
                    }
                }
            }
        }

        return r1;
    }
    //booking data
    //display rooms price range

    public Pair display(){
        Room r=null;
        System.out.println("Select the range :: \n1.<=500 \n2.501 to 1000\n3.1001 to 1500\n4.>=1501");
        int a=Integer.MIN_VALUE;
        int b=Integer.MAX_VALUE;
        int ch=sc.nextInt();
        switch (ch){
            case 1:{
                b=500;
                break;
            }
            case 2:{
                a=501;
                b=1000;
                break;
            }
            case 3:{
                a=1001;
                b=1500;
                break;
            }
            case 4:{
                a=1501;
                break;
            }
        }
       return new Pair(a,b);
    }

//take feedback form

//and pass it to Admin_info..
}
