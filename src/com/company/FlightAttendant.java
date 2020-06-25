package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class FlightAttendant extends Employee implements RandomLanguage{
    private Language language1;
    private Language language2;

    public FlightAttendant(String name, String phone, double salary) {
        super(name, phone, salary);
        this.language1 = getRandomLanguage();
        this.language2 = getRandomLanguage();

    }

    public Language getLanguage1() {
        return language1;
    }

    public Language getLanguage2() {
        return language2;
    }
}
