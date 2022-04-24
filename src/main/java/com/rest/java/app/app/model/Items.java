package com.rest.java.app.app.model;

import java.util.Arrays;

public class Items {
    private String name;
    private String[] tags;
    private double price;
    private int quantity;

    public Items(String name, String[] tags, double price, int quantity) {
        this.name = name;
        this.tags = tags;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
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

    @Override
    public String toString() {
        return "Items [name=" + name + ", price=" + price + ", quantity=" + quantity + ", tags=" + Arrays.toString(tags)
                + "]";
    }

}
