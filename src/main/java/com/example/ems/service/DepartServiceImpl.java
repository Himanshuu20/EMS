package com.example.ems.service;

import com.example.ems.dao.DepartmentDao;
import com.example.ems.entity.Department;
import com.example.ems.exception.DepartmentException;
import com.example.ems.exception.EmployeeException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DepartServiceImpl implements DepartmentService{
    @Autowired
    private DepartmentDao departmentDao;
    @Override
    public String addDepartment(Department department) throws DepartmentException {
        this.departmentDao.save(department);
        return department.getDepartmentName() + " saved to db";
    }

    @Override
    public List<Department> getDepartmentOfSam() throws DepartmentException, EmployeeException {
        return this.departmentDao.getDepartmentOfSam();
    }

    @Override
    public String updateDepartment(Department department) throws DepartmentException {
        this.departmentDao.save(department);
        return department.getDepartmentName() + " updated";
    }

    @Override
    public String deleteDepartment(int departmentId) throws DepartmentException {
        this.departmentDao.deleteById(departmentId);
        return "removed from db";
    }
}
