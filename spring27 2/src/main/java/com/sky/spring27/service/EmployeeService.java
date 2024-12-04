package com.sky.spring27.service;

import com.sky.spring27.model.Employee;

public interface EmployeeService {
    Employee add(String firstName, String lastName);
    Employee remove(String firstName, String lastName);
    Employee find(String firstName, String lastName);

}
