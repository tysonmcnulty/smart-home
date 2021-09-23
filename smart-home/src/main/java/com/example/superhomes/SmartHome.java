package com.example.superhomes;

public class SmartHome {
    public static void main(String[] args) {
        Operable theBulb = new Operable() {
            @Override
            public void turnOn() {
                System.out.println("the bulb is ON!");
            }

            @Override
            public void turnOff() {
                System.out.println("the bulb is OFF!");
            }
        };
        Switchable theSwitch = new Switchable() {
            @Override
            public boolean isOn() {
                return false;
            }
        };

        if (theSwitch.isOn()) {
            theBulb.turnOn();
        } else {
            theBulb.turnOff();
        }
    }
}
