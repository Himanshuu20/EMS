package com.example.ems.dao;

import com.example.ems.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectDao extends JpaRepository<Project,Integer> {

    @Query(value = "select p.* from project p inner join project_to_employee pe on p.project_id = pe.project_id where pe.employee_id =?1",
    nativeQuery = true)
    List<Project> findAllProjectOfEmployee(int employeeId);
}
