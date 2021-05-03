package com.satya.bhservice.controller;

import com.satya.bhservice.model.Owner;
import com.satya.bhservice.repository.IOwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequestMapping("api/v1")
@RestController
public class OwnerController {

    @Autowired
    private IOwnerRepository iOwnerRepository;

    @GetMapping("/owners")
    public List<Owner> getAllOwners() {
        return iOwnerRepository.findAll();
    }

    @GetMapping("/owner")
    public  Owner getOwner(@RequestParam UUID OwnerId) {
        return iOwnerRepository.findById(OwnerId).orElse(null);
    }

    @PostMapping("/owner")
    public void createOwner(@RequestBody Owner Owner) {
        iOwnerRepository.save(Owner);
    }

    @PutMapping("/owner")
    public void updateOwner(@RequestBody Owner Owner) {
        iOwnerRepository.save(Owner);
    }

    @DeleteMapping("/owner")
    public void deleteOwner(@RequestParam UUID OwnerId){
        iOwnerRepository.deleteById(OwnerId);
    }
}
