package com.example.ems.controller;

import com.example.ems.entity.Department;
import com.example.ems.exception.DepartmentException;
import com.example.ems.exception.EmployeeException;
import com.example.ems.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public String addDepartment(@RequestBody Department department) throws DepartmentException{
        this.departmentService.addDepartment(department);
        return department.getDepartmentName() + " saved to db";
    }
    @GetMapping("/")
    public List<Department> getDepartmentOfSam() throws DepartmentException, EmployeeException{
        return this.departmentService.getDepartmentOfSam();
    }
    @PutMapping("/")
    public String updateDepartment(@RequestBody Department department) throws DepartmentException{
        return this.departmentService.updateDepartment(department);
    }
    @DeleteMapping("/{departmentId}")
    public String removeDepartment(@PathVariable int departmentId) throws DepartmentException{
        return this.departmentService.deleteDepartment(departmentId);
    }
}
