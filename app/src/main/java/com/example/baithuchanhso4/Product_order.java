package com.example.baithuchanhso4;

import java.util.ArrayList;

public class Product_order {
    private int quantity;
    private int price;
    private int priceofsize;
    private ArrayList<Topping> toppingArrayList;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPriceofsize() {
        return priceofsize;
    }

    public void setPriceofsize(int priceofsize) {
        this.priceofsize = priceofsize;
    }

    public ArrayList<Topping> getToppingArrayList() {
        return toppingArrayList;
    }

    public void setToppingArrayList(ArrayList<Topping> toppingArrayList) {
        this.toppingArrayList = toppingArrayList;
    }
}
