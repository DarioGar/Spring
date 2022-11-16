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
import org.springframework.web.bind.annotation.RestController;

import com.example.models.PersonModel;
import com.example.models.FlightModel;
import com.example.services.PersonService;
import com.example.services.FlightService;

@RestController
@RequestMapping("/destination")
public class FlightController {
    @Autowired
    FlightService flightService;
    PersonService personService;

    @GetMapping()
    public ArrayList<FlightModel> getDestinations() {
        return flightService.getDestinations();
    }

    @GetMapping("/{id}")
    public Optional<FlightModel> getDestinations(@PathVariable("id") Long id) {
        return this.flightService.getFlightById(id);
    }

    @GetMapping("team/{id}/assessment")
    public Optional<PersonModel> getAssessmentForTeam(@PathVariable("id") Long id) {
        return this.assessmentService.getAssessmentForTeam(id);
    }
}
