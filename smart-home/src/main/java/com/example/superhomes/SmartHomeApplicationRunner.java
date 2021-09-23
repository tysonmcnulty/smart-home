package com.example.superhomes;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SmartHomeApplicationRunner implements ApplicationRunner {

    private final Operable operable;

    public SmartHomeApplicationRunner(Operable operable) {

        this.operable = operable;
    }

    @Override
    public void run(ApplicationArguments args) {
        System.out.println("**** Smart Home ****");

        Switchable theSwitch = new Switchable() {
            @Override
            public boolean isOn() {
                return false;
            }
        };

        if (theSwitch.isOn()) {
            operable.turnOn();
        } else {
            operable.turnOff();
        }
    }
}
