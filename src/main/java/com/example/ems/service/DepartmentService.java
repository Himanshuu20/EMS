package com.example.ems.service;

import com.example.ems.entity.Department;
import com.example.ems.exception.DepartmentException;
import com.example.ems.exception.EmployeeException;

import java.util.List;

public interface DepartmentService {
    String addDepartment(Department department) throws DepartmentException;
    List<Department> getDepartmentOfSam() throws DepartmentException, EmployeeException;
    String updateDepartment(Department department) throws DepartmentException;
    String deleteDepartment(int departmentId) throws DepartmentException;
}
