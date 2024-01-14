package com.example.ems.controller;

import com.example.ems.entity.Employee;
import com.example.ems.exception.DepartmentException;
import com.example.ems.exception.EmployeeException;
import com.example.ems.exception.ProjectException;
import com.example.ems.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/")
    public String addEmployee(@RequestBody Employee employee) throws EmployeeException{
        return this.employeeService.addEmployee(employee);
    }

    @GetMapping("/department/{department}")
    public List<Employee> getEmployeesOfIT(@PathVariable String department) throws EmployeeException, DepartmentException{
        return this.employeeService.getEmployeesOfIT(department);
    }

    @GetMapping("/project/{project}")
    public List<Employee> getEmployeesOfProject(@PathVariable int project) throws EmployeeException, ProjectException{
        return this.employeeService.getEmployeesOfProject(project);
    }
    @PutMapping("/")
    public String updateEmployee(@RequestBody Employee employee) throws EmployeeException{
        return this.employeeService.updateEmployee(employee);
    }
    @DeleteMapping("/{employeeId}")
    public String removeEmployee(@PathVariable int employeeId) throws EmployeeException{
        return this.employeeService.deleteEmployee(employeeId);
    }
}
