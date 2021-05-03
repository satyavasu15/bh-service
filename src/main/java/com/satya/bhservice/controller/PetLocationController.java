package com.satya.bhservice.controller;

import com.satya.bhservice.model.PetLocation;
import com.satya.bhservice.repository.IPetLocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequestMapping("api/v1")
@RestController
public class PetLocationController {

    @Autowired
    private IPetLocationRepository iPetLocationRepository;

    @GetMapping("/petlocations")
    public List<PetLocation> getAllPetLocations() {
        return iPetLocationRepository.findAll();
    }

    @GetMapping("/petlocation")
    public  PetLocation getPetLocation(@RequestParam UUID PetLocationId) {
        return iPetLocationRepository.findById(PetLocationId).orElse(null);
    }

    @PostMapping("/petlocation")
    public void createPetLocation(@RequestBody PetLocation PetLocation) {
        iPetLocationRepository.save(PetLocation);
    }

    @PutMapping("/petlocation")
    public void updatePetLocation(@RequestBody PetLocation PetLocation) {
        iPetLocationRepository.save(PetLocation);
    }

    @DeleteMapping("/petlocation")
    public void deletePetLocation(@RequestParam UUID PetLocationId){
        iPetLocationRepository.deleteById(PetLocationId);
    }
}
