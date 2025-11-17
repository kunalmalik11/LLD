package org.example.Decorator;

public abstract class Beverages {
    private String description = "Beverage";
    public String getDescription(){
        return description;
    }
    public abstract double cost();

}
