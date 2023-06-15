package com.loskarjova.shop;

public abstract class AbstractTShirt implements Item {
    @Override
    public String name() {
        return "T-Shirt";
    }

    @Override
    public double prise() {
        return 5.75;
    }

    @Override
    public String company() {
        return "Active sports";
    }
}
