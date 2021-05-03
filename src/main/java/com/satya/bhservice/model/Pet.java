package com.satya.bhservice.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Data
@Entity
@Table(name = "Pet")
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="petId", insertable = false, updatable = false, nullable = false)
    private UUID petId;
    private String name;
    private String animalType;
    private String breed;
    private Date dob;
}
