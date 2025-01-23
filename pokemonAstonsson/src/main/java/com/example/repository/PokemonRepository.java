package com.example.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.model.Pokemon;

import java.util.List;

public interface PokemonRepository extends MongoRepository<Pokemon, String> {
    List<Pokemon> findByType(String type);  // Custom query method
}
