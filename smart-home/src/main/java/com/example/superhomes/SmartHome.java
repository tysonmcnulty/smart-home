package com.example.superhomes;

import com.example.amazingbulbs.Bulb9000;
import com.example.amazingbulbs.Operable;
import com.example.fantasticswitches.Switch9000;
import com.example.fantasticswitches.Switchable;

public class SmartHome {
    public static void main(String[] args) {
        Operable theBulb = new Bulb9000();
        Switchable theSwitch = new Switch9000();

        if (theSwitch.isOn()) {
            theBulb.turnOn();
        } else {
            theBulb.turnOff();
        }
    }
}
