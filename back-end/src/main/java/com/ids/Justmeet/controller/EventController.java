package com.ids.Justmeet.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ids.Justmeet.model.Event;
import com.ids.Justmeet.repository.EventRepository;

@CrossOrigin(origins = "*", maxAge = 3600)
// @CrossOrigin(origins = "http://localhost:8100")
@RestController
@RequestMapping("/api")


public class EventController {
    @Autowired
    EventRepository eventRepository;
  
    @GetMapping("/event")
    public ResponseEntity<List<Event>> getAllevents(@RequestParam(required = false) String title) {
      try {
        List<Event> events = eventRepository.findByPublished(false);
  
        if (events.isEmpty()) {
          return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(events, HttpStatus.OK);
      } catch (Exception e) {
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
      }
    }
  
    @PostMapping("/events")
    public ResponseEntity<Event> createevent(@RequestBody Event event) {
      try {
        Event _event = eventRepository
            .save(new Event(event.getTitle(), event.getDescription(), event.getCategory(), event.getLocation(), event.getDate(), event.getUser(), false));
        return new ResponseEntity<>(_event, HttpStatus.CREATED);
      } catch (Exception e) {
        return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
      }
    }
  
    @PutMapping("/events/{id}")
    public ResponseEntity<Event> updateevent(@PathVariable("id") long id, @RequestBody Event event) {
      Optional<Event> eventData = eventRepository.findById(id);
  
      if (eventData.isPresent()) {
        Event _event = eventData.get();
        // _event.setTitle(event.getTitle());
        // _event.setDescription(event.getDescription());
        // _event.setCategory(event.getCategory());
        // _event.setLocation(event.getLocation());
        // _event.setdateEvent(event.getDateEvent());
        _event.setPublished(event.isPublished());
        return new ResponseEntity<>(eventRepository.save(_event), HttpStatus.OK);
      } else {
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
      }
    }
  
    @DeleteMapping("/events/{id}")
    public ResponseEntity<HttpStatus> deleteevent(@PathVariable("id") long id) {
      try {
        eventRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
      } catch (Exception e) {
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
      }
    }
  
    @DeleteMapping("/events")
    public ResponseEntity<HttpStatus> deleteAllevents() {
      try {
        eventRepository.deleteAll();
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
      } catch (Exception e) {
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
      }
  
    }
  
    @GetMapping("/events/published")
    public ResponseEntity<List<Event>> findByPublished() {
      try {
        List<Event> events = eventRepository.findByPublished(true);
  
        if (events.isEmpty()) {
          return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(events, HttpStatus.OK);
      } catch (Exception e) {
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
      }
    }
}