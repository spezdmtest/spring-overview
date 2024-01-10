package com.griddynamics.Scope_Annotation_Configuration;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
@Component
public class Robot {
}
