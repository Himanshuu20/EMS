package com.example.ems.dao;

import com.example.ems.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentDao extends JpaRepository<Department,Integer> {

    @Query(value = "select d.* from department d inner join employee e on d.department_id = e.department_id where e.first_name in ('SAM','Sam','sam')",
    nativeQuery = true)
    List<Department> getDepartmentOfSam();
}
