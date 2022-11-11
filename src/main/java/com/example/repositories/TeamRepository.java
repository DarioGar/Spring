package com.example.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.models.TeamModel;

@Repository
    public interface TeamRepository extends CrudRepository<TeamModel,Long>{

    }
