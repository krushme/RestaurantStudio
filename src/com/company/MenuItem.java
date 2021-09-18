package com.company;

import java.util.Objects;

public class MenuItem {
    private String name;
    private String description;
    private Double price;
    private String category;
    private Boolean isNew;

    //constructor

    public MenuItem(String name, Double price, String description, String category, boolean isNew) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.isNew = false;

    }

    public MenuItem(String name, Double price, String description, String category) {
        this(name, price, description, category, true);

    }
    public MenuItem(){

    }

    public boolean isItemNew() {
        return isNew;
    }
    //overrides

    @Override
    public String toString() {
        String listing = "menu item: " + this.name + "    price: " + this.price;
        String newOrNot = "";
        if(isNew) {
            newOrNot = "      new!!!";
        }

        return listing.concat(newOrNot);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return Objects.equals(name, menuItem.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }


    //getters and setters

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }
    public void setDescription(String description) {
        this.description = description;

    }    public Double getPrice() {
        return this.price;
    }
    public void setPrice(Double price) {
        this.price = price;

    }    public String getCategory() {
        return this.category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    public Boolean getIsNew() {
        return this.isNew;
    }
    public void setIsNew(Boolean isNew) {
        this.isNew = isNew;
        }
}
