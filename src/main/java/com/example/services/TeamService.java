package com.example.services;

import java.util.ArrayList;
import java.util.Optional;

import com.example.models.TeamModel;
import com.example.repositories.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeamService {
    @Autowired
    TeamRepository teamRepository;

    public ArrayList<TeamModel> getTeams(){
       return (ArrayList<TeamModel>) teamRepository.findAll();
    }

    public Optional<TeamModel> getTeamById(Long id){
        return teamRepository.findById(id);
    }

    public TeamModel saveEntity(TeamModel teamModel){
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
