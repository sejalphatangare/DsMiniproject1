package com.company.model;

public class


Room {
    private boolean usageStatus;
    private int rId;
    private String uniqueId;
    //1,2,3,4,5
    private int rating;
    //single , double triple , Queen sized, king sized , twin , hollywood twin room , double double , studio , Suite , Presidential suite
    private int beds;
    private int isAC;

    //deluxe , super deluxe
    private String speciality;

    private String description;
    private double price;

    public boolean isUsageStatus() {
        return usageStatus;
    }

    public void setUsageStatus(boolean usageStatus) {
        this.usageStatus = usageStatus;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    private Customer c;

    public void setAC(int isAC) {
        this.isAC = isAC;
    }
    public int getAC() {
        return isAC;
    }

//    public void setUsageStatus(boolean usageStatus) {
//        this.usageStatus = usageStatus;
//    }
//    public boolean isUsageStatus() {
//        return usageStatus;
//    }

    public Room(int rId, String uniqueId, int rating, int beds, int isAC, String speciality, String description,Boolean usageStatus) {
        this.rId = rId;
        this.uniqueId = uniqueId;
        this.rating = rating;
        this.beds = beds;
        this.isAC = isAC;
        this.speciality = speciality;
        this.description = description;
        this.usageStatus=usageStatus;
        c=null;
    }
    public Room(){

    }

    public int getrId() {
        return rId;
    }

    public void setrId(int rId) {
        this.rId = rId;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }


    public int getBeds() {
        return beds;
    }

    public void setBeds(int beds) {
        this.beds = beds;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Customer getC() {
        return c;
    }

    public void setC(Customer c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return
                " \nRoom Number =" + rId +
                ", Unique Room ='" + uniqueId + '\'' +
                ", Rating of the Room =" + rating +
                ", No. of Beds=" + beds +
                ", Status ='" + usageStatus + '\'' +
                ", Ac=" + isAC +
                ", speciality='" + speciality + '\'' +
                ", description='" + description + '\'' ;
    }


}

