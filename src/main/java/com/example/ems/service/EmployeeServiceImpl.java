package com.example.ems.service;

import com.example.ems.dao.EmployeeDao;
import com.example.ems.entity.Employee;
import com.example.ems.exception.DepartmentException;
import com.example.ems.exception.EmployeeException;
import com.example.ems.exception.ProjectException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeDao employeeDao;
    @Override
    public String addEmployee(Employee employee) throws EmployeeException {
        this.employeeDao.save(employee);
        return employee.getFirstName() + employee.getLastName() + " saved to db";
    }

    @Override
    public List<Employee> getEmployeesOfIT(String str) throws EmployeeException, DepartmentException {
        System.out.println(this.employeeDao.getEmployeesOfDepartment(str));
        return this.employeeDao.getEmployeesOfDepartment(str);
    }

    @Override
    public List<Employee> getEmployeesOfProject(int projectId) throws EmployeeException, ProjectException {
        return this.employeeDao.getEmployeesOfProject(projectId);
    }

    @Override
    public String updateEmployee(Employee employee) throws EmployeeException {
        this.employeeDao.save(employee);
        return employee.getFirstName() + employee.getLastName() + " updated";
    }

    @Override
    public String deleteEmployee(int employeeId) throws EmployeeException {
        this.employeeDao.deleteById(employeeId);
        return "removed from db";
    }
}
