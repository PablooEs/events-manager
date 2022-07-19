package com.rootop.eventsmanager.domain.event;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public interface EventGateway {
    List<Event> getEventsSince(LocalDate date);
    List<Event> getEventsFrom(LocalDate date);
}
