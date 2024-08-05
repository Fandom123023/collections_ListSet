import exeption.MissDeportmentExertiom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

    @RestController
    @RequestMapping("/departments")
        public class EmployeeController {

        private final EmployeeService employeeService;

        @Autowired
        public EmployeeController(EmployeeService employeeService) {
            this.employeeService = employeeService;
        }

        @GetMapping("/max-salary")
        public Employee getMaxSalaryDepartment(@RequestParam int department) {
            return employeeService.findEmployeeMaxSalary(department);

        }

        @GetMapping("/min-salary")
        public Employee getMinSalaryDepartment(@RequestParam int department) {
            return employeeService.findEmployeeMinSalary(department);
        }

        @GetMapping("/all")
        public Map<Integer, List<Employee>> getAllEmployee() {
            return employeeService.allEmployee();
        }

        @GetMapping("/all-department")
        public List<Employee> getEmployeeDepartment(@RequestParam(required = false) Integer department) {
            if (department == null) {
                throw new MissDeportmentExertiom();
            }
            return employeeService.allEmployeeDepartment(department);
        }
    }


