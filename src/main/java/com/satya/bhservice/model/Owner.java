package com.satya.bhservice.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Data
@Entity
@Table(name = "Owner")
public class Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ownerId", insertable = false, updatable = false, nullable = false)
    private UUID ownerId;
    private String name;
    private UUID petId;
}
