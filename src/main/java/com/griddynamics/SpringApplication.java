package com.griddynamics;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class SpringApplication
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        ElectricityStation electricityStation = context.getBean(ElectricityStation.class);
//        System.out.println(electricityStation);
//
//        System.out.println("==========================");
//
//        WaterPumpStation waterPumpStation = context.getBean(WaterPumpStation.class);
//        System.out.println(waterPumpStation);
        DistrictSystem districtSystem = context.getBean(DistrictSystem.class);
        System.out.println(districtSystem);
    }
}
