import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class EmployeeService {
    public static final List<Employee>  SiliconValley = new ArrayList<>(List.of(
            new Employee("ричард", 40000,7),
            new Employee("джаред",50000,2),
            new Employee("динэш",35000,1)));
    public Employee findEmployeeMinSelary(int department){
        return SiliconValley.stream().filter(employee -> employee.getDepartment() == department).
                min(Comparator.comparingInt(employee -> employee.getSalery())).
                orElseThrow(() -> new EmployeeDepartmentExeptiom());
    }
    public List<Employee> allEmployeeDepartment(int department) {
        List<Employee> employees = SiliconValley.stream()
                .filter(employee -> employee.getDepartment() == department)
                .collect(Collectors.toList());
        if (employees.isEmpty()){
            throw new EmployeeDepartmentExeptiom();
        }
        return employees;

        static Map<Integer, List<Employee>> allEmployee() {
            return SiliconValley.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        }
    }
}
