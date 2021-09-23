package com.example.amazingbulbs;

public class Bulb9000 implements Operable {
    @Override
    public void turnOn() {
        System.out.println("The bulb is ON!");
    }

    @Override
    public void turnOff() {
        System.out.println("The bulb is OFF!");
    }
}
