package com.training.employeedetail;

import org.springframework.stereotype.Component;

@Component
public class Employee implements IEmployee {

    @Override
    public String getName() {
        return "Jigar";
    }
}
