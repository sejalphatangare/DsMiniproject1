package com.company.model;

import java.util.Scanner;

import java.util.LinkedList;
import java.util.Queue;


public class Employee {
    private int EmployeeID;
    private String EmployeeName;
    private int age;
    private char EmployeeSex;
    private String EmployeeWorkingArea;
    private double EmployeeAmt;

    public double getEmployeeAmt() {
        return amt;
    }

    public void setEmployeeAmt(double salary) {
        this.amt = salary;
    }

    private double amt;//checking fees

    public int getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(int empID) {
        EmployeeID = empID;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String empName) {
        EmployeeName = empName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getEmployeeSex() {
        return EmployeeSex;
    }

    public void setEmployeeSex(char empSex) {
        EmployeeSex = empSex;
    }

    public String getEmployeeWorkingArea() {
        return EmployeeWorkingArea;
    }

    public void setEmployeeWorkingArea(String empWorkingArea) {
        EmployeeWorkingArea = empWorkingArea;
    }

    //constructor to set the variables
    public Employee(int empID, String empName, int age, char empSex, String empWorkingArea,double salary) {
        EmployeeID = empID;
        EmployeeName = empName;
        this.age = age;
        EmployeeSex = empSex;
        EmployeeWorkingArea = empWorkingArea;
        amt=salary;

    }
    public Employee(){

    }
}

