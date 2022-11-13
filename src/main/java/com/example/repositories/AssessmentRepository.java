package com.example.repositories;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.models.AssessmentModel;

@Repository
    public interface AssessmentRepository extends CrudRepository<AssessmentModel,Long>{
        public abstract Optional<AssessmentModel> findByTeam(Integer teamId);
    }