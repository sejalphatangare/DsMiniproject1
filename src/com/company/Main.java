package com.company;
import com.company.info.Admin_info;
import com.company.info.Employee_info;
import com.company.info.Room_info;
import com.company.model.CategoryRooms;
import com.company.model.Customer;
import com.company.model.Employee;

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
        Employee_info e1=new Employee_info();
        Employee e=new Employee();

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
                                        System.out.println("\n\t1]Add new Category price : \n\t2]Add n rooms of same price :\n\t3]Remove a Category : \n\t4]See Available Rooms : \n\t5]Search a Category :\n\t6]Show all Guest Details : \n\tquestion mark?7]View Booked Rooms :\n\t8]Remove a Room of Same Category: ");
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
                                    }
                                    case 2: {
                                        System.out.println("\n\t1]Display Employee Details:\n\t2]Add a Employee:\n\t3]Remove Employee\n\t4]Search Employee By ID:\n\t5]Search Employee By Working Area: ");
                                        System.out.println("\n\tEnter your Choice: ");
                                        switch (sc.nextInt()) {
                                            case 1: {
                                                e1.viewemployeeDetails();
                                            }
                                            case 2: {
                                                e1.addEmployee();
                                            }
                                            case 3: {
                                                e1.removeEmployee();
                                            }
                                            case 4: {
                                                System.out.println("\n\tEnter the Employee ID:");
                                                int temp_id = sc.nextInt();
                                                e1.searchEmployee(temp_id);
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
                                    }
                                }
                                System.out.println("\n\tDo you want to Continue as a ADMIN : press 1: ");
                            } while (sc.nextInt() == 1);
                        } else {
                            System.out.println("\n\t-----------------ACCESS DENIED-----------------!\n\t\tWRONG PASSWORD");
                        }
                        System.out.println("\n\tDo you want to Login again as ADMIN :\n\t\tpress 1:");
                    } while (sc.nextInt() == 1);
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
                                System.out.println("\n\t1]View available Rooms\n\t2]Register Customer\n\t3]Search room for Customer: \n\t4]Display Rooms\n\t5]Book Room for Customer :\n\t6] ");
                                System.out.println("\n\tDo you want to continue as a Receptionist: \n\tpress 1:");
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