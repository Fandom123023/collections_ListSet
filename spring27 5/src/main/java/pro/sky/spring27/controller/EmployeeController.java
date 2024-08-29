package pro.sky.spring27.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.spring27.model.Employee;
import pro.sky.spring27.service.EmployeeServiceImpl;

import java.util.Map;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private EmployeeServiceImpl employeeServiceIml;
@Autowired
    public EmployeeController(EmployeeServiceImpl employeeServiceIml) {
        this.employeeServiceIml = employeeServiceIml;
    }
@GetMapping("/add")
    public Employee add(@RequestParam String firstName,@RequestParam String lastName) {
    return employeeServiceIml.add(firstName,lastName);
}
    @GetMapping("/remove")
    public Employee remove (@RequestParam String firstName, @RequestParam String lastName){
        return employeeServiceIml.remove(firstName,lastName);
    }
    @GetMapping("/find")
    public Employee find (@RequestParam String firstName, @RequestParam String lastName){
        return employeeServiceIml.find(firstName, lastName);
    }
    @GetMapping("/all")

    public Map<String,Employee> all (){
        return employeeServiceIml.all();
    }

}

