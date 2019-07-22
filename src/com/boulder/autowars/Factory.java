package com.boulder.autowars;

import com.boulder.autowars.vehicles.Vehicle;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Factory {

    // Define props/methods
    String name;

    // Constructor
    public Factory(String name) {
        this.name = name;
    }

    // Build a series of vehicles from a json array of objects
    Vehicle[] processOrders(String json) {
        JsonArray orders = new JsonParser().parse(json).getAsJsonArray();
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        for (int i = 0; i < orders.size(); i++) {
            JsonObject order = orders.get(i).getAsJsonObject();
            String type = order.get("type").getAsString();
            Vehicle vehicle = null;
            Class<?> c;

            try {
                c = Class.forName("com.boulder.autowars.vehicles." + type.substring(0, 1).toUpperCase() + type.substring(1));
                vehicle = (Vehicle) c.getConstructor(JsonObject.class).newInstance(order);
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InstantiationException | InvocationTargetException e) {
                e.printStackTrace();
            }

            vehicles.add(vehicle);
        }

        System.out.println("Orders Processed: " + Arrays.deepToString(vehicles.toArray()));
        return vehicles.toArray(new Vehicle[0]);
    }

    // Build a generic vehicle from a json object
    // (Mainly just included to demonstrate the Builder pattern)
    Vehicle buildGenericVehicle(JsonObject order) {
        JsonObject maintAndInsur = order.get("maintenanceAndInsurance").getAsJsonObject();

        String type = order.get("type").getAsString();
        String vin = order.get("vin").getAsString();
        String make = order.get("make").getAsString();
        String model = order.get("model").getAsString();
        String color = order.get("color").getAsString();
        String description = order.get("description").getAsString();

        int year = order.get("year").getAsInt();
        int wheels = order.get("wheels").getAsInt();
        int mileage = order.get("mileage").getAsInt();
        int fuel = order.get("fuel").getAsInt();

        BigDecimal price = order.get("price").getAsBigDecimal();
        BigDecimal costToDealership = order.get("costToDealership").getAsBigDecimal();

        Date lastInsured = Date.from(Instant.parse(maintAndInsur.get("lastInsured").getAsString()));
        Date lastServiced = Date.from(Instant.parse(maintAndInsur.get("lastServiced").getAsString()));

        boolean clean = order.get("clean").getAsBoolean();

        // Builder Pattern Example
        return new Vehicle.Builder()
                .type(type)
                .vin(vin)
                .make(make)
                .model(model)
                .color(color)
                .description(description)
                .year(year)
                .wheels(wheels)
                .mileage(mileage)
                .fuel(fuel)
                .price(price)
                .costToDealership(costToDealership)
                .lastInsured(lastInsured)
                .lastServiced(lastServiced)
                .clean(clean)
                .build();
    }

}
