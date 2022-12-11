package com.company;
import com.company.info.*;
import com.company.model.*;

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
        Room r=new Room();
        CategoryRooms c1 = new CategoryRooms();
        Customer cu = new Customer();
        Customer_info ci=new Customer_info();
        Employee_info e1=new Employee_info();
        Employee e=new Employee();
        Receiptionist_info r2=new Receiptionist_info();

        System.out.println("\n\t-*******************************************************");
        System.out.println("\n\t---------------WELCOME TO GREEN lAND HOTEL----------------- ");
        System.out.println("\n\t-*******************************************************");
        System.out.println("\n\t__________________________LOGIN___________________________");
        do {
//        ask for admin,customer or customer
            System.out.println("\n\tWho are you?");
            System.out.println("\n\t1]Admin\n\t2]Receptionist\n\t3]Customer");
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
                                System.out.println("\n\tWhat you want to work on:\n\t1]ROOMS:\n\t2]EMPLOYEES:");
                                System.out.println("\n\tEnter your Choice:");
                                switch (sc.nextInt()) {
                                    case 1: {
//                                        System.out.println("\n\t1]Add new Category price : \n\t2]Add n rooms of same price :\n\t3]Remove a Category : \n\t4]See Available Rooms : \n\t5]Search a Category :\n\t6]Show all Guest Details : \n\tquestion mark?7]View Booked Rooms :\n\t8]Remove a Room of Same Category:\n\t 9]Update Room : ");
                                        System.out.println("\n\t1]Category Type of Rooms :\n\t2]Rooms: ");
                                        System.out.println("\n\tEnter your Choice : ");
                                        switch (sc.nextInt()) {
                                            case 1: {
                                                do {
                                                    System.out.println("\n\t1]Add New Category: \n\t2]Remove a Category: \n\t3]See Available Rooms: \n\t4]Search A Category: \n\t5]Show all Customer Details: \n\t");
                                                    System.out.println("\n\tEnter your Choice: ");
                                                    switch (sc.nextInt()) {
                                                        case 1: {
                                                            a1.insert();                                                                             //add Categories
                                                            break;
                                                        }
                                                        case 2: {
                                                            a1.inorder(Admin_info.root);
                                                            System.out.println("\n\tEnter the price of the room you want to delete: ");             //delete a category
                                                            double del_room = sc.nextInt();
                                                            a1.deletion(Admin_info.root, del_room);
                                                            break;
                                                        }
                                                        case 3: {
                                                            System.out.println("\n\t**********ROOM INFO*********");
                                                            a1.inorder(Admin_info.root);                                                            //view categories
                                                            break;
                                                        }
                                                        case 4: {
                                                            a1.searchCategory();                                                                     //search a category
                                                            break;
                                                        }
                                                        case 5: {
                                                            System.out.println("\n\t Not done yet ");
                                                        }
                                                    }
                                                    System.out.println("\n\tDo you continue working on Categories: \n\tpress 1:");
                                                } while (sc.nextInt() == 1);
                                                break;
                                            }
                                            case 2: {
                                                do {
                                                    System.out.println("\n\t1]Add a room to the Category: \n\t2]Delete a Room from a Category: \n\t3]Display Rooms\n\t4]Search a room in the Category: \n\t5]Update a room in the Category: ");
                                                    System.out.println("\n\tEnter your Choice: ");
                                                    switch (sc.nextInt()) {
                                                        case 1: {
                                                            r1.addRoom();
                                                            break;
                                                        }
                                                        case 2: {
                                                            r1.deleteRoom();
                                                            break;
                                                        }
                                                        case 3: {
                                                            r1.display_rooms();
                                                            break;
                                                        }
                                                        case 4: {
                                                            r1.search();
                                                            break;
                                                        }
                                                        case 5: {
                                                            r1.updateRoom();
                                                            break;
                                                        }
                                                    }
                                                    System.out.println("\n\tDo you want to Continue working on the Rooms: \n\tpress 1: ");
                                                } while (sc.nextInt() == 1);
                                            }
                                        }
                                        break;
                                    }
                                    case 2: {
                                        do {
                                            System.out.println("\n\t1]Display Employee Details:\n\t2]Add a Employee:\n\t3]Remove Employee\n\t4]Search Employee By ID:\n\t5]Search Employee By Working Area: ");
                                            System.out.println("\n\tEnter your Choice: ");
                                            switch (sc.nextInt()) {
                                                case 1: {
                                                    e1.viewemployeeDetails();
                                                    break;
                                                }
                                                case 2: {
                                                    e1.addEmployee();
                                                    break;
                                                }
                                                case 3: {
                                                    e1.removeEmployee();
                                                    break;
                                                }
                                                case 4: {
                                                    System.out.println("\n\tEnter the Employee ID:");
                                                    int temp_id = sc.nextInt();
                                                    e1.searchEmployee(temp_id);
                                                    break;
                                                }
                                                case 5: {
                                                    System.out.println("\n\tEnter the Employee Working area:\n\t1]House Keeping\n\t2]Manager\n\t3]Receiptionist\n\t4]Security Guard\n\t5]Cleaner");
                                                    switch (sc.nextInt()) {
                                                        case 1: {
                                                            e.setEmployeeWorkingArea("House Keeping");
                                                            break;
                                                        }
                                                        case 2: {
                                                            e.setEmployeeWorkingArea("Manager");
                                                            break;
                                                        }
                                                        case 3: {
                                                            e.setEmployeeWorkingArea("Receptionist");
                                                            break;
                                                        }
                                                        case 4: {
                                                            e.setEmployeeWorkingArea("Security Guard");
                                                        }
                                                        case 5: {
                                                            e.setEmployeeWorkingArea("Cleaner");
                                                        }
                                                    }
                                                    e1.searchEmployee(e.getEmployeeWorkingArea());
                                                }
                                            }
                                            System.out.println("\n\tDo you Want to Continue Working on Employees: \n\tpress 1: ");
                                        } while (sc.nextInt() == 1);
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
                    break;
                }

                    //customer
                    //view room details
                    //book room
                case 2:{
                    do{
                        System.out.println("\n\t************************RECEPTIONIST****************************");
                        System.out.println("\n\tEnter the Password : ");
                        String password=br.readLine();
                        if (password.equalsIgnoreCase("Receptionist")){
                            System.out.println("\n\tLogged in Successfully");
                            do{
                                System.out.println("\n\t1]View available Rooms\n\t2]Register Customer\n\t3]Search room for Customer: \n\t4]Display Rooms\n\t5]Book Room for Customer :\n\t ");
                                System.out.println("\n\tDo you want to continue as a Receptionist: \n\tpress 1:");
                                switch (sc.nextInt()) {
                                    case 1: {
                                        r2.inorder(Admin_info.root);
                                        break;
                                    }
                                    case 2: {
                                        r2.takedetailsfromCustomer();
                                        break;
                                    }
                                    case 3: {
                                        Pair p1 = new Pair();
                                        Pair pair = r2.display();
                                        r2.searchRoomForCustomer(Admin_info.root, pair);
                                        break;
                                    }
                                    case 4:{
                                        r2.getCategoryRoom(Admin_info.root);
                                        break;
                                    }
                                    case 5:{
                                        r2.bookRoomforCustomer(r);
                                        break;
                                    }
                                }
                            }while(sc.nextInt()==1);
                        }else{
                            System.out.println("\n\t-----------------ACCESS DENIED-----------------!\n\t\tWRONG PASSWORD");
                        }
                        System.out.println("\n\tDo you want to again log in as Receptionist");
                    }while(sc.nextInt()==1);
                }
            }
        } while (sc.nextInt() == 1);
        System.out.println("\n\t*************Thank you! Visit again**************");
    }

}