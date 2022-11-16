package com.example.models;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;


@Entity
@Table(name = "assessment")
public class PersonModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = true)
    private Long id;
    private String name;
    private String country;
    private String NIF;
    private Integer age;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "flight_id", referencedColumnName = "id")
    private FlightModel flight;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }



    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getNIF() {
        return NIF;
    }
    public void setNIF(String nIF) {
        NIF = nIF;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public void setFlight(FlightModel flight) {
        this.flight = flight;
    }
    public FlightModel getFlight() {
        return flight;
    }
    public void setTeam(FlightModel flight) {
        this.flight = flight;
    }

    
    
}
