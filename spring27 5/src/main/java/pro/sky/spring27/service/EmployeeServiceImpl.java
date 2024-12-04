package pro.sky.spring27.service;

import ch.qos.logback.core.util.StringUtil;
import exception.NotValidateEmployeeExeption;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import pro.sky.spring27.exception.EmployeeAlreadyAddedException;
import pro.sky.spring27.exception.EmployeeNotFoundException;
import pro.sky.spring27.exception.EmployeeStorageFullException;
import pro.sky.spring27.model.Employee;

import java.util.*;

@Service
public class EmployeeServiceImpl  {
    private static final int COUNT_EMPLOYEE = 9;
    private Map<String,Employee> workers = new HashMap<>();

    /**
     * добавляет сотрудника
     * @param firstName имя сотрудника
     * @param lastName фамилия
     * @return добавленного сотрудника
     */
    private void validateEmployee(String firstName, String lastName) {
        if (StringUtils.isBlank(firstName) || StringUtils.isBlank(lastName)) {
            throw new NotValidateEmployeeExeption();
        }
    }

    private String formatCaseEmployee(String name) {
        return StringUtils.capitalize(name.toLowerCase());
    }
    public Employee add(String firstName, String lastName) {
        validateEmployee(firstName, lastName);
        firstName = formatCaseEmployee(firstName);
        lastName = formatCaseEmployee(lastName);
        if (workers.size() >= COUNT_EMPLOYEE) {
            throw new EmployeeStorageFullException("слишком много сотрудников");
        }

        Employee employee = new Employee(firstName, lastName);
        if (workers.containsKey(employee.getFullName())) {
            throw new EmployeeAlreadyAddedException("уже имеется в коллекции");
        }
        workers.put(firstName + lastName,employee);
        return employee;
    }

    public Map<String,Employee> all() {return new HashMap<>(workers);
    }
    public Employee remove(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        workers.remove(employee.getFullName());
        return employee;

    }

    public Employee find (String firstName, String lastName){
        Employee employee = new Employee(firstName, lastName);
        if (workers.containsKey(employee.getFullName())) {
                return workers.get(employee.getFullName());
            }
            throw new EmployeeNotFoundException("сотрудник не найден");
    }


    }



