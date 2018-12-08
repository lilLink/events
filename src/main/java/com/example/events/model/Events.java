package com.example.events.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Events {
    @Id
    private String eventName;
    private String details;
    private String duration;
    @ManyToOne
    private Establishment establishment;
    @OneToMany
    private Client client;
    private String date;
    private Integer places;
    private boolean isAccept;

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public boolean isAccept() {
        return isAccept;
    }

    public void setAccept(boolean accept) {
        isAccept = accept;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Establishment getEstablishment() {
        return establishment;
    }

    public void setEstablishment(Establishment establishment) {
        this.establishment = establishment;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getPlaces() {
        return places;
    }

    public void setPlaces(Integer places) {
        this.places = places;
    }

    public Events(String eventName, String details, String duration, Establishment establishment, String date, Integer places, boolean isAccept) {
        this.eventName = eventName;
        this.details = details;
        this.duration = duration;
        this.establishment = establishment;
        this.date = date;
        this.places = places;
        this.isAccept = isAccept;
    }


}
