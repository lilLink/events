package com.example.events.model;

import com.example.events.model.Establishment;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Events {
    @Id
    private String eventName;
    private String details;
    private String duration;
    @ManyToOne
    private Establishment establishment;
    private String date;
    private Integer places;

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

    public Events(String eventName, String details, String duration, Establishment establishment, String date, Integer places) {
        this.eventName = eventName;
        this.details = details;
        this.duration = duration;
        this.establishment = establishment;
        this.date = date;
        this.places = places;
    }


}
