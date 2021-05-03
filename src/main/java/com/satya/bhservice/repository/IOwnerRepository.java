package com.satya.bhservice.repository;

import com.satya.bhservice.model.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface IOwnerRepository extends JpaRepository<Owner, UUID> {
}
