package com.example.superhomes;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SmartHomeApplicationRunner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) {
        System.out.println("**** Smart Home ****");

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
