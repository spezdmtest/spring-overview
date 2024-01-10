package com.griddynamics;

import org.springframework.stereotype.Component;

@Component
public class RobotFactory {
    Robot create() {
        return new Robot();
    }
}
