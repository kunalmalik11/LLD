package org.example.Strategy;

public abstract class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;
    public void makeSound(){
        quackBehaviour.makeSound();
    }
    public void fly(){
        flyBehaviour.fly();
    }

}
