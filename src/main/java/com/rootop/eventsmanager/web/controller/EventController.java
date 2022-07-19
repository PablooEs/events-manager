package com.rootop.eventsmanager.web.controller;

import com.rootop.eventsmanager.domain.event.EventDate;
import com.rootop.eventsmanager.domain.event.EventService;
import com.rootop.eventsmanager.web.dto.EventDTO;
import com.rootop.eventsmanager.web.utils.mapper.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static java.util.stream.Collectors.toList;

@RestController
public class EventController {

    private final EventService eventService;
    private final Mapper mapper;

    @Autowired
    public EventController(EventService eventService, Mapper mapper) {
        this.eventService = eventService;
        this.mapper = mapper;
    }

    @GetMapping("/events")
    public ResponseEntity<List<EventDTO>> getEvents(@RequestParam(defaultValue = "since") String date){
        return new ResponseEntity<>(eventService.getEvents(date).stream()
                .map(e -> mapper.toEventDTO(e))
                .collect(toList()), HttpStatus.OK);
    }
}
