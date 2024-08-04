package pro.sky.spring27.service;

import pro.sky.spring27.model.Employee;

import java.util.Collection;
import java.util.List;

public interface EmployeeService {
    Employee remove (String firstName, String lastName);
    Employee find (String firstName, String lastName);
    Employee add (String firstName, String lastName);
    Collection<Employee> all ();


}
