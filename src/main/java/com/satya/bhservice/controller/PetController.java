package com.satya.bhservice.controller;

import com.satya.bhservice.model.Pet;
import com.satya.bhservice.repository.IPetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RequestMapping("api/v1")
@RestController
public class PetController {

    @Autowired
    private IPetRepository iPetRepository;

    @GetMapping("/pets")
    public List<Pet> getAllPets() {
        return iPetRepository.findAll();
    }

    @GetMapping("/pet")
    public  Pet getPet(@RequestParam UUID petId) {
        return iPetRepository.findById(petId).orElse(null);
    }

    @PostMapping("/pet")
    public void createPet(@RequestBody Pet pet) {
        iPetRepository.save(pet);
    }

    @PutMapping("/pet")
    public void updatePet(@RequestBody Pet pet) {
        iPetRepository.save(pet);
    }

    @DeleteMapping("/pet")
    public void deletePet(@RequestParam UUID petId){
        iPetRepository.deleteById(petId);
    }
}
