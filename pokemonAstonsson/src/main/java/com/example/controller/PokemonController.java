package com.example.controller ;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.example.repository.*;
import com.example.model.*;

@RestController
@RequestMapping("/api/pokemon")
public class PokemonController {
    private final PokemonRepository repository;

    public PokemonController(PokemonRepository repository){
        this.repository = repository;
    }

    @GetMapping
    public List<Pokemon> getAllPokemons() {
        return repository.findAll();
    }

}
