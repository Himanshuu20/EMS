package com.example.ems.controller;

import com.example.ems.entity.Project;
import com.example.ems.exception.EmployeeException;
import com.example.ems.exception.ProjectException;
import com.example.ems.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/project")
public class ProjectController {
    @Autowired
    private ProjectService projectService;

    @PostMapping("/")
    public String addProject(@RequestBody Project project) throws ProjectException{
        this.projectService.addProject(project);
        return project.getProjectName() + " saved to db";
    }
    @GetMapping("/{employeeId}")
    public List<Project> getProjectOfEmployee(@PathVariable int employeeId) throws ProjectException, EmployeeException {
        return this.projectService.getProjectOfEmployee(employeeId);
    }
    @PutMapping("/")
    public String updateProject(@RequestBody Project project) throws ProjectException {
        return this.projectService.updateProject(project);
    }
    @DeleteMapping("/{projectId}")
    public String removeProject(@PathVariable int projectId) throws ProjectException{
        return this.projectService.deleteProject(projectId);
    }
}
