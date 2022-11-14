package com.example.models;
import javax.persistence.*;

@Entity
@Table(name="member")
public class MemberModel {
        
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = true)
    private Long id;
    private String name;
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

    public TeamModel getTeam() {
        return team;
    }
    public void setTeam(TeamModel team) {
        this.team = team;
    }

}
