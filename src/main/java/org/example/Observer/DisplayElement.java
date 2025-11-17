package org.example.Observer;

public class DisplayElement implements Observer{
    private String temp;
    private WeatherData weatherData;
    public DisplayElement(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }
    @Override
    public void update(){
        this.temp = weatherData.getValue();
        System.out.println("value is " + this.temp);
    }
}
