package com.example.services;

import java.util.ArrayList;
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

    public TeamModel getTeamById(Long id){
        return teamRepository.findById(id).get();
    }
}
