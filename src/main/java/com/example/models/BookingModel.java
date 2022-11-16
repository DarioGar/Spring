package com.example.models;
import javax.persistence.*;

@Entity
@Table(name="member")
public class BookingModel {
        
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = true)
    private Long id;
    private String name;
    @ManyToOne
    @JoinColumn(name="team")
    private FlightModel team;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    @Column(nullable = false)
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public FlightModel getTeam() {
        return team;
    }
    public void setTeam(FlightModel team) {
        this.team = team;
    }

}
