package com.example.superhomes;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SmartHomeApplicationRunner implements ApplicationRunner {

    private final Operable operable;
    private final Switchable switchable;

    public SmartHomeApplicationRunner(Operable operable, Switchable switchable) {

        this.operable = operable;
        this.switchable = switchable;
    }

    @Override
    public void run(ApplicationArguments args) {
        System.out.println("**** Smart Home ****");

        if (switchable.isOn()) {
            operable.turnOn();
        } else {
            operable.turnOff();
        }
    }
}
