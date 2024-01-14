package com.example.ems.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Project")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "projectId")
    private int projectId;
    @Column(name = "projectName")
    private String projectName;
    @Column(name = "projectLocation")
    private String projectLocation;
    @ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinTable(name = "project_to_employee",
            joinColumns = {@JoinColumn(name = "projectId",referencedColumnName = "projectId")},
            inverseJoinColumns ={@JoinColumn(name = "employeeId",referencedColumnName = "employeeId")}
    )
    private List<Employee> employees;
}
