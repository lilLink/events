package com.example.events.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Establishment {
    @Id
    private UUID establishmentId;
    private String name;
}
