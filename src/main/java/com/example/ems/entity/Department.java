package com.example.ems.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Department")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "departmentId")
    private int departmentId;
    @Column(name = "departmentName")
    private String departmentName;
    @OneToMany(mappedBy = "department",cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Employee> employees;
}
