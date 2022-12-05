package com.company.info;
import java.util.*;
import java.io.*;


import com.company.model.Customer;

public class Customer_info {
    Scanner sc=new Scanner(System.in);
    InputStreamReader ir=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(ir);

    //take user data
    public Customer customerInfo() throws IOException {
//int cId, String fname, String lname, String city, String phNo, String email, String adhharNo
        Customer c=null;
        for (int i=0;i<c.getLst().size();i++){
            System.out.println("Enter the Customer "+(i+1)+"Details:");
            c.setcId(i);
            System.out.println("Enter First Name:");
            c.setFname(br.readLine());
            System.out.println("Enter Last Name:");
            c.setLname(br.readLine());
            System.out.println("Enter Address:");
            c.setCity(br.readLine());
            System.out.println("Enter Phone Number of the Customer:");
            c.setPhNo(br.readLine());
            System.out.println("Enter Email Id :");
            c.setEmail(br.readLine());
            System.out.println("Enter Addhar Card Number:");
            c.setAdhharNo(br.readLine());
        }


        return c;
    }

}
