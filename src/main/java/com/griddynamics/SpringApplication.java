package com.griddynamics;

import com.griddynamics.Scope_Java_Configuration.Robot;
import com.griddynamics.Scope_Java_Configuration.RobotFactory;
import com.griddynamics.Scope_Java_Configuration.RobotProductionConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class SpringApplication {
    public static void main(String[] args) {

//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        ElectricityStation electricityStation = context.getBean(ElectricityStation.class);
//        System.out.println(electricityStation);
//
//        System.out.println("==========================");
//
//        WaterPumpStation waterPumpStation = context.getBean(WaterPumpStation.class);
//        System.out.println(waterPumpStation);
//        DistrictSystem districtSystem = context.getBean(DistrictSystem.class);
//        System.out.println(districtSystem);

//        DistrictSystem districtSystem = context.getBean(DistrictSystem.class);
//        System.out.println(districtSystem);

        //Java_Configuration
        ApplicationContext context = new AnnotationConfigApplicationContext(RobotProductionConfiguration.class);
        RobotFactory robotFactory = context.getBean(RobotFactory.class);
        System.out.println(robotFactory);
        Robot robot1 = context.getBean(Robot.class);
        System.out.println(robot1);
        Robot robot2 = context.getBean(Robot.class);
        System.out.println(robot2);

        //Annotation_Configuration
//       ApplicationContext context =
//                new AnnotationConfigApplicationContext("com.griddynamics.Scope_Annotation_Configuration");
//        RobotFactory robotFactory = context.getBean(RobotFactory.class);
//        System.out.println(robotFactory);
//        Robot robot1 = context.getBean(Robot.class);
//        System.out.println(robot1);
//        Robot robot2 = context.getBean(Robot.class);
//        System.out.println(robot2);
    }
}
