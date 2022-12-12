package com.company.info;


    //Admin.java
import com.company.model.Employee;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Scanner;

    /*public class Admin {
        LinkedList<Employee> d;
        public Admin(){
            d=new LinkedList<>(); //constructor to create list of doctors
        }
*/

public class Employee_info {
    LinkedList<Employee> d;

    public Employee_info() {
        d = new LinkedList<Employee>();
    }

    public void employeesInitialData(){
            Employee d1=new Employee(1,"Rajesh Kumarr",33,'m',"Housekeeping",1000);
            d.add(d1);
            Employee d2=new Employee(2,"Mahesh Kelkar",77,'m',"Manager",4300);
            d.add(d2);
            Employee d3=new Employee(3,"Khushi Patill",28,'f',"Receiptionist",2400);
            d.add(d3);
            Employee d4=new Employee(4,"Raju Guptay",50,'m',"Security Guard",1500);
            d.add(d4);
            Employee d5=new Employee(5,"Manasvi Shinde",36,'f',"Cleaner",2000);
            d.add(d5);
        }
        Scanner sc=new Scanner(System.in);

        public void viewemployeeDetails(){
            System.out.println("Enter choice for details of \n1-All employee \n2-Specific employee");
            System.out.println("---------------------------------------------------------------------------------");
            switch (sc.nextInt()){
                case 1:{
                    System.out.println("--------------------------------Employees Information-------------------------------");
                    System.out.println("\nID\t\tEmployeeName\t\tAge\t\tSex\t\tWorkingArea");
                    System.out.println("--------------------------------------------------------------------------------");
                    for(int i=0;i<d.size();i++){
                        System.out.println(d.get(i).getEmployeeID() + "\t\t" +d.get(i).getEmployeeName()+"\t\t"+d.get(i).getAge()+"\t\t "+d.get(i).getEmployeeSex()+"\t\t"+d.get(i).getEmployeeWorkingArea());
                    }
                    System.out.println("---------------------------------------------------------------------------------");
                    break;
                }
                case 2:{
                    System.out.println("Enter the id of the Employee whose details are to be displayed "); //accepting id of a doctor to display details of specific doctor
                    int id=sc.nextInt();
                    int i=searchEmployee(id);
                    if(i>=0){
                        System.out.println("--------------------------------"+d.get(i).getEmployeeName()+" Information----------------------------");
                        System.out.println("\nID\t\tEmployeeName\t\tAge\t\tSex\t\tWorkingArea");
                        System.out.println(d.get(i).getEmployeeID() + "\t\t"+d.get(i).getEmployeeName()+"\t\t"+d.get(i).getAge()+"\t\t "+d.get(i).getEmployeeSex()+"\t\t"+d.get(i).getEmployeeWorkingArea());
                        System.out.println("---------------------------------------------------------------------------------");
                    }else{
                        System.out.println("Employee ID invalid");
                    }
                    break;
                }
            }
        }
        public void addEmployee(){
            do {
                System.out.println("Enter the Employee details :- \n ");
                int i = d.get(d.size()-1).getEmployeeID() + 1;  //assigning new doctor id at end of the list
                System.out.println("Enter the Employee Name ");
                String name = sc.next();
                boolean flag=false;
                int age=24;
                while (!flag){
                    try{
                        System.out.println("Enter the Employee Age ");
                        age = sc.nextInt();
                        if(age<23 || age>100){
                            throw new Exception(); //exception is thrown if age isn't appropriate
                        }
                        flag=true;
                    }catch (Exception e){
                        System.out.println("Invalid age for this Role"); //printing the exception
                    }
                }

                System.out.println("Enter the Employee Gender ");
                char gender = sc.next().charAt(0);
                String EmployeeType="";
                System.out.println("Enter the Employee Working Area \n1-Manager\n2-Housekeeping\n3-Receiptionist\n4-Security Guard\n5-Cleaner ");
                System.out.println("------------------------------------------------------------");
                switch (sc.nextInt()){
                    case 1:
                        EmployeeType="Manager";
                        break;
                    case 2:
                        EmployeeType="Housekeeping";
                        break;
                    case 3:
                        EmployeeType="Receiptionist";
                        break;
                    case 4:
                        EmployeeType="Security Guard";
                        break;
                    case 5:
                        EmployeeType="Cleaner";
                        break;
                    default:
                        System.out.println("INVALID CHOICE");
                        break;
                }
                System.out.println("Enter the salary of Employee");
                double salary=sc.nextDouble();
                Employee emp = new Employee(i, name, age, gender, EmployeeType,salary);
                d.add(emp);
                System.out.println("Employee Added Successfully");
                System.out.println("------------------------------------------------------------");
                System.out.println("Do you want to add more Employees, if yes press 1 ");
            }while(sc.nextInt()==1);
        }


        public void removeEmployee(){
            System.out.println("Enter the id of the Employee to be Deleted ");
            int id=sc.nextInt();
            int i=searchEmployee(id);
            if(i>=0) {
                d.remove(i);
                System.out.println("Employee Successfully Deleted");
            }
            else
            {
                System.out.println("Invalid Employee Id ");
            }
        }


        public int searchEmployee(int id){
            for(int i=0;i<d.size();i++){
                if(id==d.get(i).getEmployeeID()){
                    return i;
                }
            }
            return -1;
        }


        public LinkedList<Integer> searchEmployee(String s){
            LinkedList<Integer> empindex=new LinkedList<>();
            for(int i=0;i<d.size();i++){
                if(Objects.equals(s, d.get(i).getEmployeeWorkingArea())){
                    empindex.add(i);
                }
            }
            return empindex;
        }
    }


