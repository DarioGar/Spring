package com.example.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.models.PersonModel;
import com.example.services.PersonService;
import com.example.services.FlightService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/assessment")
public class PersonController {
    
    @Autowired
    FlightService teamService;
    PersonService assessmentService;

    @GetMapping()
    public ArrayList<PersonModel> getTeams() {
        return assessmentService.getAssessments();
    }

    @GetMapping("/{id}")
    public Optional<PersonModel> getAssessment(@PathVariable("id") Long id) {
        return this.assessmentService.getAssessmentForTeam(id);
    }


    @PostMapping()
    public PersonModel saveEntity(@RequestBody PersonModel assessment) {
        return this.assessmentService.saveEntity(assessment);
    }

    @DeleteMapping(path = "/{id}")
    public String delete(@PathVariable("id") Long id){
        boolean success = this.assessmentService.deleteAssessment(id);
        if(success)
            return "Removed: " + id;
        else
            return "Failed to remove: " + id; 
    }
}
