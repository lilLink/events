package com.example.events.service;

import com.example.events.model.Events;
import com.example.events.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {
    @Autowired
    private EventRepository repository;

    public List<Events> findAll(){
        return repository.findAll();
    }
}
