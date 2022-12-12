package com.company.info;
import java.util.*;
import java.io.*;


import com.company.model.CategoryRooms;
import com.company.model.Customer;

public class Customer_info {
    static Scanner sc=new Scanner(System.in);
    static InputStreamReader ir=new InputStreamReader(System.in);
    static BufferedReader br=new BufferedReader(ir);
    static int k=0;
    static CategoryRooms c1=new CategoryRooms();
    public List<Customer> getCustomerList() {
        return customerList;
    }
    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }
    private List<Customer> customerList;

    public Customer_info(){
        customerList=new LinkedList<>();
    }

    @Override
    public String toString() {
        return "Customer_info{" +
                "customerList=" + customerList +
                '}';
    }

    //take user data
    public static Customer customerInfo() throws IOException {
//int cId, String fname, String lname, String city, String phNo, String email, String adhharNo
        Customer c=new Customer();
            System.out.println("Enter the Customer Details:");
            c.setcId(k++);
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

        return c;
    }

    public void addCustomer(Customer c){
        customerList.add(c);
    }

}
