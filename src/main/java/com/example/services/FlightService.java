package com.example.services;

import java.util.ArrayList;
import java.util.Optional;

import javax.persistence.EntityManager;

import com.example.models.PersonModel;
import com.example.models.FlightModel;
import com.example.repositories.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlightService {
    @Autowired
    FlightRepository teamRepository;

    EntityManager entityManager;

    public ArrayList<FlightModel> getTeams(){
       return (ArrayList<FlightModel>) teamRepository.findAll();
    }

    public Optional<FlightModel> getTeamById(Long id){
        return teamRepository.findById(id);
    }

    public FlightModel saveEntity(FlightModel teamModel){
        if(teamModel.getAssessment().size()!= 0){
            for (PersonModel am : teamModel.getAssessment()) {
                am.setTeam(teamModel);
            }
        }
        return teamRepository.save(teamModel);
    }

    public boolean deleteTeam(Long id) {
        try {
            teamRepository.deleteById(id);
            return true;
        }catch(Exception ex){
            return false;
        }
    }

}
