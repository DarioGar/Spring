package com.example.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.models.AssessmentModel;
import com.example.repositories.AssessmentRepository;

@Service
public class AssessmentService {
    @Autowired
    AssessmentRepository assessmentRepository;
    
    public Optional<AssessmentModel> getAssessmentForTeam(Integer team) {
        return assessmentRepository.findByTeam(team);
    }
    
}
