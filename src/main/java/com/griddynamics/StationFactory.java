package com.griddynamics;

public class StationFactory {
    public StationFactory() {
        System.out.println("Station Factory created! Good Job!");
    }

    public ElectricityStation createElectricityStation() {
        return new ElectricityStation();
    }

    public WaterPumpStation createWaterPumpStation() {
        return WaterPumpStation.getInstance();
    }
}
