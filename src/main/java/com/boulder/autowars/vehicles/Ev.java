package com.boulder.autowars.vehicles;

import com.google.gson.JsonObject;

public class Ev extends Vehicle {

    public int getMpkWh() {
        return mpkWh;
    }

    public void setMpkWh(int mpkWh) {
        this.mpkWh = mpkWh;
    }

    // Define subclass properties
    int mpkWh = 5;

    // Constructor (from JSON obj)
    public Ev(JsonObject order) {
        super(order);

        this.setFuelCapacity(75);
    }

}
