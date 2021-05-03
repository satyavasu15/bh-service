package com.satya.bhservice.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;
import java.util.UUID;

@Data
@Entity
@Table(name = "PetLocation")
public class PetLocation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="petlocationId", insertable = false, updatable = false, nullable = false)
    private UUID petlocationId;
    private String lat;
    private String lon;
    private UUID petId;
    private Timestamp time;
}
