package com.example.ems.service;

import com.example.ems.entity.Project;
import com.example.ems.exception.EmployeeException;
import com.example.ems.exception.ProjectException;

import java.util.List;

public interface ProjectService {
    String addProject(Project project) throws ProjectException;
    List<Project> getProjectOfEmployee(int employeeId) throws ProjectException, EmployeeException;
    String updateProject(Project project) throws ProjectException;
    String deleteProject(int projectId) throws ProjectException;
}
