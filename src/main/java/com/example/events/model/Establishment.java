package com.example.events.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Establishment {
    @Id
    private UUID establishmentId;
    private String name;
    private String address;

    public UUID getEstablishmentId() {
        return establishmentId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setEstablishmentId(UUID establishmentId) {
        this.establishmentId = establishmentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Establishment(UUID establishmentId, String name, String address) {
        this.establishmentId = establishmentId;
        this.name = name;
        this.address = address;
    }
}
