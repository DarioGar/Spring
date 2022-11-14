package com.example.models;
import javax.persistence.*;


@Entity
@Table(name = "assessment")
public class AssessmentModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = true)
    private Long id;
    private String name;
    private Integer points;
    @ManyToOne
    @JoinColumn(name="team_id")
    private TeamModel team;

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
    @Column(nullable = false)
    public Integer getPoints() {
        return points;
    }
    public void setPoints(Integer points) {
        this.points = points;
    }
    public TeamModel getTeam() {
        return team;
    }
    public void setTeamM(TeamModel team) {
        this.team = team;
    }

    
    
}
