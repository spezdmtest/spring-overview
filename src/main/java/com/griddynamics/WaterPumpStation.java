package com.griddynamics;

public class WaterPumpStation {
//    private static final WaterPumpStation INSTANCE = new WaterPumpStation();
//
//    private WaterPumpStation() {
//        System.out.println("Water-pump Station created via static factory method! Good job!");
//    }
//
//    public static WaterPumpStation getInstance() {
//        return INSTANCE;
//    }
    private String name;
    private int capacity;
    private int pumpQuantity;

    public WaterPumpStation(String name, int capacity, int pumpQuantity) {
        this.name = name;
        this.capacity = capacity;
        this.pumpQuantity = pumpQuantity;
    }

    public WaterPumpStation() {
        System.out.println("Water Station created! Good Job");
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
