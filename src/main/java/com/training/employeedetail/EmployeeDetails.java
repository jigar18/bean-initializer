package com.training.employeedetail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class EmployeeDetails {

    @Autowired(required = false)
    private IEmployee employee = null;

    @PostConstruct
    public void displayName() {
        if(employee != null) {
            System.out.println(employee.getName());
        }
    }

}
