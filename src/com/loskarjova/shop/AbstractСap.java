package com.loskarjova.shop;

public abstract class AbstractСap implements Item {

    @Override
    public String name() {
        return "Cap";
    }

    @Override
    public double prise() {
        return 3.03;
    }

    @Override
    public String company() {
        return "Smart caps";
    }
}
