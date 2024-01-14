package com.example.ems.dao;

import com.example.ems.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeDao extends JpaRepository<Employee,Integer> {
    @Query(value = "select e.* from employee e inner join department d on e.department_id = d.department_id where d.department_name = ?1"
    ,nativeQuery = true)
    List<Employee> getEmployeesOfDepartment(String department);

    @Query(value = "select e.* from employee e inner join project_to_employee pe on e.employee_id = pe.employee_id where pe.project_id =?1"
    ,nativeQuery = true)
    List<Employee> getEmployeesOfProject(int projectId);
}
