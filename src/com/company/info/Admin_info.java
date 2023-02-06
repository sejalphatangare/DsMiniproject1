package com.company.info;

import com.company.model.CategoryRooms;// importing package for this package
import com.company.model.Room;


import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.io.*;


public class Admin_info {
    //create BST
    public static CategoryRooms root = null;
    InputStreamReader ir = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(ir);

    static Scanner sc = new Scanner(System.in);

    //create or insert BST
    public void insert() throws IOException {
//        Room_info ri=new Room_info();
        List<Room> lst = new LinkedList<>();
        Room_info ri=new Room_info();
        do {
            CategoryRooms ptr = new CategoryRooms();
            ptr.setLst(lst);
            System.out.println("Enter the price of the room:");
            double temp_price = sc.nextDouble();
            ptr.setPrice(temp_price);
            System.out.println("Enter the number of rooms you want to add :: ");
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                Room r1=ri.data(temp_price);
                r1.setPrice(temp_price);
                lst.add(r1);
            }
            CategoryRooms cur;
            if (root == null) {
                ptr.setLeft(null);
                ptr.setRight(null);
                root = ptr;
                System.out.println("Inserted the root");
            } else {
                cur = root;
                ptr.setLeft(null);
                ptr.setRight(null);
                while (cur != null) {
                    if (cur.getPrice() > ptr.getPrice()) {
                        if (cur.getLeft() == null) {
                            cur.setLeft(ptr);
                            break;
                        } else {
                            cur = cur.getLeft();
                        }
                    } else {
                        if (cur.getRight() == null) {
                            cur.setRight(ptr);
                            break;
                        } else {
                            cur = cur.getRight();
                        }
                    }
                }
//            CategoryRooms cr = new CategoryRooms(lst, price);
            }
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("\n\tDo you want to add more rooms of same category type:\n\tpress 1:");
//            System.out.println("\n\tRooms Added Successfully!");
        } while (sc.nextInt() == 1);
    }
    public void insert_default(CategoryRooms cr)  {
        if (root == null) {
            root = cr;
        } else {
            CategoryRooms cur;
            cur = root;
            while (cur != null) {
                if (cur.getPrice() > cr.getPrice()) {
                    if (cur.getLeft() == null) {
                        cur.setLeft(cr);
                        break;
                    } else {
                        cur = cur.getLeft();
                    }
                } else {
                    if (cur.getRight() == null) {
                        cur.setRight(cr);
                        break;
                    } else {
                        cur = cur.getRight();
                    }
                }
            }
        }
    }
    public void data(){
        //        int rId, String uniqueId, int rating, int beds, boolean isAC, String speciality, String description
        CategoryRooms cr=new CategoryRooms();
        List<Room> lst=new LinkedList<>();
        cr.setLst(lst);
        Room r1=new Room(1,"1000-1",3, 1,0,"Single",null,false);
        cr.setPrice(1000);
        r1.setPrice(cr.getPrice());
        cr.getLst().add(r1);
//        1,"1000-1",1,1,false,"Single",null
        CategoryRooms cr1=new CategoryRooms();
        lst=new LinkedList<>();
        cr1.setLst(lst);
        Room r2=new Room(1,"2000-1",3, 2,0,"Single",null,false);
        cr1.setPrice(2000);
        r2.setPrice(cr1.getPrice());
        cr1.getLst().add(r2);
//        1,"2000-1",2,2,true,"Single",null

        CategoryRooms cr2=new CategoryRooms();
        lst=new LinkedList<>();
        cr2.setLst(lst);
        Room r3=new Room(1,"150-1",1, 1,0,"Single",null,false);
        cr2.setPrice(150);
        r3.setPrice(cr2.getPrice());
        cr2.getLst().add(r3);

        insert_default(cr);
        insert_default(cr1);
        insert_default(cr2);

    }

    //delete category
    public void deletion(CategoryRooms cur, double ele) {
        if (root == null) {
            System.out.println("*******No Rooms******");
        } else {
            CategoryRooms parent = null;
            cur = root;

            while (cur != null && cur.getPrice() != ele) {
                parent = cur;
                if (cur.getPrice() > ele) {
                    cur = cur.getLeft();
                } else {
                    cur = cur.getRight();
                }

            }
            if (cur == null) {
                System.out.println("data " + ele + " Not found");
            } else {
//                cur is the node to be deleted
                if (cur.getRight() == null && cur.getLeft() == null) {
                    if (parent == null) {
                        root = null;
                        cur = null;
                        System.out.println("Deleted The only Category");
                    } else {
                        if (parent.getPrice() > ele) {
                            parent.setLeft(null);
                        } else {
                            parent.setRight(null);
                        }

                        System.out.println("\n\tDeleted\n\t" + cur.getPrice());
                        cur = null;
                    }
                } else if (cur.getLeft() != null && cur.getRight() == null) {
                    if (parent == null) {
//                        root is the node to delete and therfore parent ==null
                        root = cur.getLeft();
                        cur.setLeft(null);
                        cur = null;
                    } else {
                        if (parent.getPrice() > ele) {
//                        node (left subtree) to delete is present on the left side
                            parent.setLeft(cur.getLeft());
                            cur.setLeft(null);
                            cur = null;
                        } else {
//                        node to be deleted(left subtree ) is present on the right side of the root
                            parent.setRight(cur.getLeft());
                            cur.setLeft(null);
                            cur = null;
                        }
                    }
                } else if (cur.getRight() != null && cur.getLeft() == null) {
                    if (parent == null) {
                        root = cur.getRight();
                        cur.setRight(null);
                        cur = null;
                    } else {
                        if (parent.getPrice() < ele) {
//                            node to be deleted(right subtree) is to be found on the right side of the root
                            parent.setRight(cur.getRight());
                            cur.setRight(null);
                            cur = null;
                        } else {
//                            node to be deleted(right subtree) is to be found on the left side of the root
                            parent.setLeft(cur.getRight());
                            cur.setRight(null);
                            cur = null;
                        }
                    }
                } else if (cur.getRight() != null && cur.getLeft() != null) {
                    CategoryRooms temp = cur.getLeft();
                    CategoryRooms parent1 = cur;
                    while (temp.getRight() != null) {
                        parent1 = temp;
                        temp = temp.getRight();
                    }

                    cur.setPrice(temp.getPrice());

                    if (parent1.getRight() == temp) {
                        if (temp.getLeft() != null) {
                            parent1.setRight(temp.getLeft());
                        } else {
                            parent1.setRight(null);
                        }
                    } else {
                        if (temp.getLeft() != null) {
                            parent1.setLeft(temp.getLeft());
                        } else {
                            parent1.setLeft(null);
                        }
                    }
                }

            }
        }
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("\n\tROOM SUCCESSFULLY DELETED");
    }


    //search category
    public CategoryRooms searchCategory(){
        CategoryRooms cur;
        System.out.println("Enter the price of the room you want to search:");
            int key = sc.nextInt();
            cur = root;
            int flag = 0;
            while (cur != null) {
                if (cur.getPrice() == key) {
                    flag = 1;
                    System.out.println("-----------------------------------------------------------------------");
                    System.out.println("Data found\t" + cur.getPrice()+"\n\t"+cur.getLst());
                    System.out.println("-----------------------------------------------------------------------");
                    break;
                }
                if (cur.getPrice() > key) {
                    cur = cur.getLeft();
                } else {
                    cur = cur.getRight();
                }
            }
            if (flag == 0) {
                System.out.println("SORRY!");
            }
            return cur;
        }
    //update category
    /*public void updateRoom() throws IOException {
        Admin_info a=new Admin_info();
        CategoryRooms cur;
        cur=searchCategory();
        System.out.println("Enter the New Date to Update:");
        double newData=sc.nextDouble();
//      System.out.println("\n\tWhat do you want to Update of the room price "+cur.getPrice()+" :");
        a.deletion(root,cur.getPrice());
        a.insert();
    }*/

    public void inorder(CategoryRooms root){
//        System.out.println("\n\t*********************ROOMS INFO*************************");
        if(root!=null){
            inorder(root.getLeft());
            System.out.println(root.getLst()+" "+root.getPrice());
            inorder(root.getRight());
        }
    }
}
