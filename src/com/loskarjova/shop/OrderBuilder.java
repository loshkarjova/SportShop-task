package com.loskarjova.shop;

public class OrderBuilder {

    public Order prepareOrderA() {
        Order order = new Order();
        order.addItem(new RedTShirt());
        order.addItem(new WhiteCap());
        return order;
    }

    public Order prepareOrderB() {
        Order order = new Order();
        order.addItem(new BlueTShirt());
        order.addItem(new BlackCap());
        return order;
    }

}
