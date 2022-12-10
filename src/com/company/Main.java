package com.company;
import com.company.info.Admin_info;
import com.company.info.Room_info;
import com.company.model.CategoryRooms;
import com.company.model.Customer;

import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        //login
        Scanner sc = new Scanner(System.in);
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        Admin_info a1 = new Admin_info();
        Room_info r1 = new Room_info();
        CategoryRooms c1 = new CategoryRooms();
        Customer cu = new Customer();
        System.out.println("\n\t-*******************************************************");
        System.out.println("\n\t---------------WELCOME TO GREEN HOTEL----------------- ");
        System.out.println("\n\t-*******************************************************");
        System.out.println("\n\t__________________________LOGIN___________________________");
        do {
//        ask for admin,customer or customer
            System.out.println("\n\tWho are you?");
            System.out.println("\n\t1]Admin\n\t2]Customer\n\t3]Receptionist");
            switch (sc.nextInt()) {
//            admin
                case 1: {
                    do {
                        System.out.println("\n\t\t********ADMIN********");
                        System.out.println("\n\tEnter the Password: ");
                        String password = br.readLine();
                        if (password.equalsIgnoreCase("admin")) {
                            System.out.println("\n\tLogged in Successfully: ");
                            do {
                                System.out.println("\n\t1]Add new Category price : \n\t2]Add n rooms of same price :\n\t3]Remove a Room : \n\t4]See Available Rooms : \n\t5]Search a room :\n\t6]Show all Guest Details : \n\t7]View Booked Rooms :");
                                System.out.println("\n\tEnter your Choice : ");
                                switch (sc.nextInt()) {
                                    case 1: {
                                        a1.insert();                                                                             //add rooms
                                        break;
                                    }
                                    case 2: {
                                        r1.addRoom();
                                        break;
                                    }
                                    case 3: {
                                        a1.inorder(Admin_info.root);
                                        System.out.println("\n\tEnter the price of the room you want to delete: ");             //delete rooms
                                        double del_room = sc.nextInt();
                                        a1.deletion(Admin_info.root, del_room);
                                        break;
                                    }
                                    case 4: {
                                        a1.inorder(Admin_info.root);                                                            //view rooms
                                        break;
                                    }
                                    case 5: {
                                        a1.searchCategory();
                                        break;
                                    }
                                    case 6: {
                                        System.out.println(cu.getLst());                                                        //view all customers
                                        break;
                                    }
                                }
                                System.out.println("\n\tDo you want to Continue as a ADMIN : press 1: ");
                            } while (sc.nextInt() == 1);
                        } else {
                            System.out.println("\n\t-----------------ACCESS DENIED-----------------!\n\t\tWRONG PASSWORD");
                        }
                        System.out.println("\n\tDo you want to Login again as ADMIN :\n\t\tpress 1:");
                    } while (sc.nextInt() == 1);
                    //customer
                    //view room details
                    //book room
                }
                case 2:{
                    do{
                        System.out.println("\n\t************************RECEPTION****************************");
                        System.out.println("\n\tEnter the Password : ");
                        String password=br.readLine();
                        if (password.equalsIgnoreCase("Receptionist")){
                            System.out.println("\n\tLogged in Successfully");
                            do{
                                System.out.println("\n\t1]View available Rooms\n\t2]Register Customer\n\t3]Search room for Customer: \n\t4]Display Rooms\n\t5]Book Room for Customer :\n\t6] ");
                                System.out.println("\n\tDo you want to continue as a Recptionist: \n\tpress 1:");
                            }while(sc.nextInt()==1);
                        }else{

                        }
                        System.out.println("\n\tDo you want to again log in as Receptionist");
                    }while(sc.nextInt()==1);
                }
            }
        } while (sc.nextInt() == 1);
    }
}