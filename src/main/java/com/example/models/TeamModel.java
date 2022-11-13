package com.example.models;

import java.util.Set;

import javax.persistence.*;


@Entity
@Table(name = "team")
public class TeamModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = true)
    private Long id;
    private String name;
    private Set TeamModel;


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
    @JoinColumn(name = "fk_team_assessment", nullable = false)
    public Set getTeamModel() {
        return TeamModel;
    }
    public void setTeamModel(Set teamModel) {
        TeamModel = teamModel;
    }
    
    
    
}