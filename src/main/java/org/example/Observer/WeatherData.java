package org.example.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
    List<Observer> observerList = new ArrayList<>();
    @Override
    public void addObserver(Observer observer){
        observerList.add(observer);
    }
    @Override
    public void removeObserver(Observer observer){
        observerList.remove(observer);

    }
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
        notifyObservers();
    }
    public void notifyObservers(){
        for(Observer o: observerList){
            o.update();
        }
    }

}
