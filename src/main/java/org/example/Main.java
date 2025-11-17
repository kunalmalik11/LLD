package org.example;

import org.example.Decorator.Beverages;
import org.example.Decorator.CondimentDecorator;
import org.example.Decorator.Mocha;
import org.example.Decorator.WhippedCream;
import org.example.Observer.Demo;
import org.example.Observer.DisplayElement;
import org.example.Observer.Dog;
import org.example.Observer.WeatherData;
import org.example.Strategy.Duck;
import org.example.Strategy.FlyBehaviour;
import org.example.Strategy.FlyWithWings;
import org.example.Strategy.MallardDuck;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
//        WeatherData weatherData = new WeatherData();
//        DisplayElement displayElement = new DisplayElement(weatherData);
//        weatherData.setValue("15");
//        weatherData.setValue("20");





        // Decorator
        Beverages mocha = new Mocha();
        System.out.println(mocha.getDescription());
        Beverages whipped = new WhippedCream(mocha);
        System.out.println(whipped.getDescription());
        System.out.println(whipped.cost());



        // Strategy
        Duck mallard = new MallardDuck();
        mallard.fly();
        mallard.makeSound();

    }


}