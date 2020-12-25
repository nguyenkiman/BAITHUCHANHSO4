package com.example.baithuchanhso4;

import java.util.ArrayList;

public class Product {
    private String name;
    private int price;
    private String description;
    private ArrayList<Size> sizeArrayList;
    private ArrayList<Topping> toppingArrayList;
    private int image;

    public Product() {
    }

    public Product(String name, int price, String description, ArrayList<Size> sizeArrayList, ArrayList<Topping> toppingArrayList) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.sizeArrayList = sizeArrayList;
        this.toppingArrayList = toppingArrayList;

    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Size> getSizeArrayList() {
        return sizeArrayList;
    }

    public void setSizeArrayList(ArrayList<Size> sizeArrayList) {
        this.sizeArrayList = sizeArrayList;
    }

    public ArrayList<Topping> getToppingArrayList() {
        return toppingArrayList;
    }

    public void setToppingArrayList(ArrayList<Topping> toppingArrayList) {
        this.toppingArrayList = toppingArrayList;
    }
}
