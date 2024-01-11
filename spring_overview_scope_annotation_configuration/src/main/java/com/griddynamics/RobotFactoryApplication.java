package com.griddynamics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RobotFactoryApplication {
    public static void main(String[] args) {

        //Annotation_Configuration
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.griddynamics");
        RobotFactory robotFactory = context.getBean(RobotFactory.class);
        System.out.println(robotFactory);
        Robot robot1 = context.getBean(Robot.class);
        System.out.println(robot1);
        Robot robot2 = context.getBean(Robot.class);
        System.out.println(robot2);

    }
}
