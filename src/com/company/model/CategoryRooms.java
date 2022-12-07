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

    public CategoryRooms(List<Room> lst, double price) {
        this.lst = lst;
        this.price = price;
        left=null;
        right=null;
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
