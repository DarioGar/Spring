package com.example.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.models.AssessmentModel;
import com.example.models.TeamModel;
import com.example.services.AssessmentService;
import com.example.services.TeamService;

@RestController
@RequestMapping("/team")
public class TeamController {
    @Autowired
    TeamService teamService;
    AssessmentService assessmentService;

    @GetMapping()
    public ArrayList<TeamModel> getTeams() {
        return teamService.getTeams();
    }

    @GetMapping("/{id}")
    public Optional<TeamModel> getTeam(@PathVariable("id") Long id) {
        return this.teamService.getTeamById(id);
    }

    @GetMapping("/assessment")
    public Optional<AssessmentModel> getAssessmentForTeam(@RequestParam(required = true) Integer team) {
        return this.assessmentService.getAssessmentForTeam(team);
    }

    @PostMapping()
    public TeamModel saveEntity(@RequestBody TeamModel team) {
        return this.teamService.saveEntity(team);
    }

    @DeleteMapping(path = "/{id}")
    public String delete(@PathVariable("id") Long id){
        boolean success = this.teamService.deleteTeam(id);
        if(success)
            return "Removed: " + id;
        else
            return "Failed to remove: " + id; 
    }
}
