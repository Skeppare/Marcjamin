package com.example.repository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import com.example.model.Pokemon;

@Component
public class DataInitializer {

    @Bean
    CommandLineRunner initDatabase(PokemonRepository repository) {
        return args -> {
            repository.deleteAll();  // Clear existing data
            repository.save(new Pokemon("Pikachu", "Electric", 25));
            repository.save(new Pokemon("Charmander", "Fire", 15));
            repository.save(new Pokemon("Bulbasaur", "Grass", 10));
        };
    }
}
