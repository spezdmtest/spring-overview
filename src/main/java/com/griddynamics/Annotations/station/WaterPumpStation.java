package com.griddynamics.Annotations.station;

public class WaterPumpStation {

    private String name;
    private int capacity;
    private int pumpQuantity;

    public WaterPumpStation(String name, int capacity, int pumpQuantity) {
        this.name = name;
        this.capacity = capacity;
        this.pumpQuantity = pumpQuantity;
    }

    @Override
    public String toString() {
        return "WaterPumpStation{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                ", pumpQuantity=" + pumpQuantity +
                '}';
    }
}
