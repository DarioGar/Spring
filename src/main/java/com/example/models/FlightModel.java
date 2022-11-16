package com.example.models;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonManagedReference;



@Entity
@Table(name = "team")
public class FlightModel{

    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = true)
    @Id
    private Long id;
    @Column(nullable = false)
    private String company;
    private Integer flightNumber;
    private Date departureTime;
    private Date transitTime;
    private Integer layover;
    private Boolean luggage;
    private Double price;
    @JsonManagedReference
    @OneToMany(mappedBy="flight",cascade = CascadeType.ALL)
    private List<PersonModel> passengers;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }
    public Integer getFlightNumber() {
        return flightNumber;
    }
    public void setFlightNumber(Integer flightNumber) {
        this.flightNumber = flightNumber;
    }
    public Date getDepartureTime() {
        return departureTime;
    }
    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }
    public Date getTransitTime() {
        return transitTime;
    }
    public void setTransitTime(Date transitTime) {
        this.transitTime = transitTime;
    }
    public Integer getLayover() {
        return layover;
    }
    public void setLayover(Integer layover) {
        this.layover = layover;
    }
    public Boolean getLuggage() {
        return luggage;
    }
    public void setLuggage(Boolean luggage) {
        this.luggage = luggage;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public List<PersonModel> getPassengers() {
        return passengers;
    }
    public void setPassengers(List<PersonModel> passengers) {
        this.passengers = passengers;
    }

    
}