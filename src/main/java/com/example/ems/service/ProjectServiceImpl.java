package com.example.ems.service;

import com.example.ems.dao.ProjectDao;
import com.example.ems.entity.Project;
import com.example.ems.exception.EmployeeException;
import com.example.ems.exception.ProjectException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService{
    @Autowired
    private ProjectDao projectDao;
    @Override
    public String addProject(Project project) throws ProjectException {
        this.projectDao.save(project);
        return project.getProjectName() + " saved to db";
    }

    @Override
    public List<Project> getProjectOfEmployee(int employeeId) throws ProjectException, EmployeeException {
        return this.projectDao.findAllProjectOfEmployee(employeeId);
    }

    @Override
    public String updateProject(Project project) throws ProjectException {
        this.projectDao.save(project);
        return project.getProjectName() + " updated";
    }

    @Override
    public String deleteProject(int projectId) throws ProjectException {
        this.projectDao.deleteById(projectId);
        return "removed from db";
    }
}
