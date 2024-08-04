import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

public class EmployeeController {
    @RestController
    @RequestMapping("/departments")
    public class EmployeeCcontroller{
        private final EmployeeService employeeService;
        @Autowired
        public EmployeeController(EmployeeService employeeService) {this.employeeService = employeeService;}

        @GetMapping("/max-salary")
        public Employee getMaxSalaryDepartment(@RequestParam int department) {
            return employeeService.findEmployeeWithMaxSalary(department);
        }
        @GetMapping("/all")
        public Map<Integer,>
    }
}
