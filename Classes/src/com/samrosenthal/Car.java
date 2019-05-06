package com.samrosenthal;

public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;


    public void setDoors (int doors) {
        this.doors = doors;
    }

    public void setWheels (int wheels) {
        this.wheels = wheels;
    }

    public void setEngine (String engine) {
        this.engine = engine;
    }

    public void setColor (String color) {
        this.color = color;
    }

    public void setModel (String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("commodore")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

    public String getModel () {
        return this.model;
    }

}
