package com.rootop.eventsmanager.domain.event;

import java.util.List;

public interface EventService {

    List<Event> getEvents(String date);
}
