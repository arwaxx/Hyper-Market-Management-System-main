package com.mycompany.supermarket_project.model;

import java.io.Serializable;

public class OrderItem implements Serializable{
    private long itemId;
    private int quantity;
    private double price;
    
    public OrderItem(long itemId,int quantity,double price){
        this.itemId=itemId;
        this.quantity=quantity;
        this.price=price;
    }

    public long getItemId() {
        return itemId;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
}
