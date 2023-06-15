package com.loskarjova.shop;

import java.util.ArrayList;
import java.util.List;

public class Order {

    List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public double getCost() {
        double cost = 0.00;
        for (Item item : items) {
            cost += item.prise();
        }
        return cost;
    }

    public void showOrder() {
        for (Item item : items) {
            System.out.println("\nColor & Name: " + item.color() + " " + item.name());
            System.out.println("Label: " + item.company());
            System.out.println("Prise: " + "$" + item.prise());
        }
    }


}
