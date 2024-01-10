package com.griddynamics.Scope_Java_Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RobotProductionConfiguration {

    @Bean
    public RobotFactory robotFactory() {
        return new RobotFactory();
    }

    @Bean
//    @Scope("prototype")
    public Robot robot(RobotFactory factory) {
        return factory.create();
    }
}
