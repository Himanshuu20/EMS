package com.example.ems.service;

import com.example.ems.entity.Employee;
import com.example.ems.exception.DepartmentException;
import com.example.ems.exception.EmployeeException;
import com.example.ems.exception.ProjectException;

import java.util.List;

public interface EmployeeService {
    String addEmployee(Employee employee) throws EmployeeException;
    List<Employee> getEmployeesOfIT(String str) throws EmployeeException, DepartmentException;
    List<Employee> getEmployeesOfProject(int projectId) throws EmployeeException, ProjectException;
    String updateEmployee(Employee employee) throws EmployeeException;
    String deleteEmployee(int employeeId) throws EmployeeException;
}
