package com.company;

import java.util.Date;
import java.util.Random;

public class Pilot extends Employee implements ReceivedCompass{
    public Pilot(String name, String phone, double salary) {
        super(name, phone, salary);
    }

    @Override
    public boolean receivedCompass() {
        Random random = new Random();
        return random.nextBoolean();
    }
}
