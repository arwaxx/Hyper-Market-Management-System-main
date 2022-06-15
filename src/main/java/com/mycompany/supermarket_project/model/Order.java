package com.mycompany.supermarket_project.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Order implements Serializable{
    private long orderId;
    private List<OrderItem> orderItems=new ArrayList<>();
    private double totalPrice;
    public Order(long orderId,List<OrderItem> orderItems,double totalPrice){
        this.orderId=orderId;
        this.totalPrice=totalPrice;
        for (int i = 0; i < orderItems.size(); i++) {
            this.orderItems.add(orderItems.get(i));
        }
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
