package com.griddynamics;

public class WaterPumpStation {
    private static final WaterPumpStation INSTANCE = new WaterPumpStation();

    private WaterPumpStation() {
        System.out.println("Water-pump Station created via static factory method! Good job!");
    }

    public static WaterPumpStation getInstance() {
        return INSTANCE;
    }
}
