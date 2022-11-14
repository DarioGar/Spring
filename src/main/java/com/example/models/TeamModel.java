package com.example.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;



@Entity
@Table(name = "team")
public class TeamModel{

    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = true)
    @Id
    private Long id;
    private String name;
    @OneToMany(targetEntity=AssessmentModel.class,mappedBy="id")
    private List<AssessmentModel> assessment = new ArrayList<>();

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    @Column(nullable = true)
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<AssessmentModel> getAssessment() {
        return assessment;
    }
    public void setAssessment(List<AssessmentModel> assessment) {
        this.assessment = assessment;
    }

    
    
    
}