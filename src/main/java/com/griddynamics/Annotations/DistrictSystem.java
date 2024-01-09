package com.griddynamics.Annotations;

import com.griddynamics.Annotations.infrastructured.Metro;
import com.griddynamics.Annotations.infrastructured.Tunnel;
import com.griddynamics.Annotations.station.ElectricityStation;
import com.griddynamics.Annotations.station.WaterPumpStation;
import com.griddynamics.Annotations.station.petrol.PetrolStation;
import com.griddynamics.Annotations.station.railway.RailwayStation;
import org.springframework.beans.factory.annotation.Autowired;

public class DistrictSystem {

    private final ElectricityStation electricityStation;
    private final WaterPumpStation waterPumpStation;
    private final RailwayStation railwayStation;
    private final PetrolStation petrolStation;
    private final Tunnel tunnel;
    private final Metro metro;

    @Autowired
    public DistrictSystem(ElectricityStation electricityStation,
                          WaterPumpStation waterPumpStation,
                          RailwayStation railwayStation,
                          PetrolStation petrolStation,
                          Tunnel tunnel,
                          Metro metro) {
        this.electricityStation = electricityStation;
        this.waterPumpStation = waterPumpStation;
        this.railwayStation = railwayStation;
        this.petrolStation = petrolStation;
        this.tunnel = tunnel;
        this.metro = metro;
    }

    @Override
    public String toString() {
        return "DistrictSystem{" +
                "\n\telectricityStation=" + electricityStation +
                ", \n\twaterpumpStation=" + waterPumpStation +
                ", \n\trailwayStation=" + railwayStation +
                ", \n\tpetrolStation=" + petrolStation +
                ", \n\ttunnel=" + tunnel +
                ", \n\tmetro=" + metro +
                "\n}";
    }
}
