package com.example.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.models.PersonModel;
import com.example.repositories.PersonRepository;

@Service
public class PersonService {
    @Autowired
    PersonRepository assessmentRepository;
    
    public Optional<PersonModel> getAssessmentForTeam(Long id) {
        return assessmentRepository.findByTeam(id);
    }

    public PersonModel saveEntity(PersonModel assessment) {
        return assessmentRepository.save(assessment);
    }

    public ArrayList<PersonModel> getAssessments() {
        return (ArrayList<PersonModel>) assessmentRepository.findAll();
    }

    public boolean deleteAssessment(Long id) {
    try{
        assessmentRepository.deleteById(id);
        return true;
    }catch(Exception ex){
        return false;
    }
}
    
}
