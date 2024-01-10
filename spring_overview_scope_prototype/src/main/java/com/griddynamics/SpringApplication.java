package com.griddynamics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplication
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        RobotFactory robotFactory = context.getBean(RobotFactory.class);
        System.out.println(robotFactory);
        context.getBean(Robot.class);
        Robot robot1 = context.getBean(Robot.class);
        System.out.println(robot1);
        Robot robot2 = context.getBean(Robot.class);
        System.out.println(robot2);
    }
}
