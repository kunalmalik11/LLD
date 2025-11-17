package org.example.Decorator;

public class WhippedCream extends CondimentDecorator{
    public WhippedCream(Beverages beverages){
        this.beverages = beverages;
    }

    public String getDescription() {
        return "1";
    }

    public double cost() {
        return beverages.cost() + .2;
    }
}
