package org.example.Strategy;

public class MallardDuck extends Duck{
    public MallardDuck(){
        quackBehaviour = new Sound();
        flyBehaviour = new FlyWithWings();
    }

}
