package com.example.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.models.BookingModel;


@Repository
    public interface BookingRepository extends CrudRepository<BookingModel,Long>{
        public abstract Optional<BookingModel> findByTeam(Long id);
    }