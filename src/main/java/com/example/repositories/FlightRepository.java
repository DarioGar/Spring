package com.example.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.models.FlightModel;

@Repository
    public interface FlightRepository extends CrudRepository<FlightModel,Long>{
        public abstract FlightModel findById(Integer id);
    }

