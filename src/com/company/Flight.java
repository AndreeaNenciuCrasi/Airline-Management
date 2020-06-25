package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ThreadLocalRandom;

public class Flight implements RandomLanguage{
    private int id;
    private static int countId = 0;
    private int numberOfPassengers;
    private Language language;

    public Flight() {
        countId++;
        this.id = countId;
        this.numberOfPassengers = ThreadLocalRandom.current().nextInt(100, 250);
        this.language = getRandomLanguage();
    }

    public boolean checkIfFlightIsReady(){
        if(this.numberOfPassengers < 220){
            return true;
        }
        return false;
    }


    public int getId() {
        return id;
    }
    

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public Language getLanguage() {
        return language;
    }

}
