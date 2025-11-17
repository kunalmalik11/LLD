package org.example.Strategy;

public class Sound implements QuackBehaviour{

    @Override
    public void makeSound() {
        System.out.println("quack");
    }
}
