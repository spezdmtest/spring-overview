package com.griddynamics.Scope_Annotation_Configuration;

import org.springframework.stereotype.Component;

@Component
public class RobotFactory {
    Robot create() {
        return new Robot();
    }
}
