package com.example.events.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Establishment {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String address;

    public Long getEstablishmentId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setEstablishmentId(Long establishmentId) {
        this.id = establishmentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
