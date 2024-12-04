package com.sky.spring27.service;

import com.sky.spring27.model.Employee;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final List<Employee> employeeList;

    public EmployeeServiceImpl () {
        this.employeeList = new ArrayList<>();
    }

    @Override
    public Employee add(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        return null;
    }

    @Override
    public Employee remove(String firstName, String lastName) {return null;}

    @Override
    public Employee find(String firstName, String lastName) {return null;}
}
