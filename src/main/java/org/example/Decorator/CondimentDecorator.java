package org.example.Decorator;

public abstract class CondimentDecorator extends Beverages{
    Beverages beverages;
    public abstract String getDescription();
}
