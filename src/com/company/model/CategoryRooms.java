package com.company.model;

import java.util.List;
public class CategoryRooms {
    private List<Room> lst;

    public CategoryRooms getLeft() {//
        return left;
    }

    public void setLeft(CategoryRooms left) { // access
        this.left = left;
    }

    public CategoryRooms getRight() {
        return right;
    }

    public void setRight(CategoryRooms right) {
        this.right = right;
    }

    private double price;
    CategoryRooms left;
    CategoryRooms right;

    public CategoryRooms( double price) {
        this.lst = null;
        this.price = price;
        left=null;
        right=null;
    }

    @Override
    public String toString() {
        return "Category Type: " +
                "Rooms " + lst +
                ", Price = " + price +
                '}';
    }

    public CategoryRooms(){

    }
    public List<Room> getLst() {
        return lst;
    }

    public void setLst(List<Room> lst) {
        this.lst = lst;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
