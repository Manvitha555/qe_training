package com.example;

import java.util.ArrayList;

import java.util.Date;
import java.util.List;

public class Plane {

    private int maxPassengers;
    private List<String> passengers;
    private Date lastTimeTookOff;
    private Date lastTimeLanded;

    public Plane(int maxPassengers) {
        this.maxPassengers = maxPassengers;
        this.passengers = new ArrayList<>();
    }

    public void setPassengers(List<String> passengers) {
        this.passengers = passengers;
    }

    public List<String> getPassengers() {
        return passengers;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }
}
