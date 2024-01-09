package com.griddynamics;

public class DistrictSystem {
    private final ElectricityStation electricityStation;
//    private final WaterPumpStation waterPumpStation;
    private WaterPumpStation waterPumpStation;

    public DistrictSystem(ElectricityStation electricityStation) {
        System.out.println("District System created! Good job!");
        this.electricityStation = electricityStation;
//        this.waterPumpStation = waterPumpStation;
    }

    public void setWaterPumpStation(WaterPumpStation waterPumpStation) {
        this.waterPumpStation = waterPumpStation;
    }

    @Override
    public String toString() {
        return "DistrictSystem{" +
                "electricityStation=" + electricityStation +
                ", waterPumpStation=" + waterPumpStation +
                '}';
    }
}
