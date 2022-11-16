package com.example.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.models.PersonModel;

@Repository
    public interface PersonRepository extends CrudRepository<PersonModel,Long>{
        public abstract Optional<PersonModel> findByTeam(Long id);
    }