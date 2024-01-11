package com.griddynamics.notworking;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BadRobotFactoryApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(BadRobotProductionConfiguration.class);
        RobotFactory robotFactory = context.getBean(RobotFactory.class);
        System.out.println(robotFactory);

        Robot robot1 = context.getBean(Robot.class);
        System.out.println(robot1);

        Robot robot2 = context.getBean(Robot.class);
        System.out.println(robot2);
    }
}
