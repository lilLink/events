package com.example.events.controller;

import com.example.events.model.Events;
import com.example.events.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EventsController {
    @Autowired
    private EventService eventService;

    @GetMapping("/allEvents")
    public List<Events> getAllEvents() {
        return eventService.findAll();
    }
}
