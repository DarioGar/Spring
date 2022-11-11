package com.example.models;

import javax.persistence.*;


@Entity
@Table(name = "team")
public class TeamModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = true)
    private Long id;
    private String name;
    private String more;
    private Integer more2;


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
    
    
}