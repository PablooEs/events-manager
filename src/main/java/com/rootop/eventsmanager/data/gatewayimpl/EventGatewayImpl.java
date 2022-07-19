package com.rootop.eventsmanager.data.gatewayimpl;

import com.rootop.eventsmanager.domain.event.Event;
import com.rootop.eventsmanager.domain.event.EventGateway;

import java.time.LocalDate;
import java.util.List;

public class EventGatewayImpl implements EventGateway {
    @Override
    public List<Event> getEventsSince(LocalDate date) {
        return null;
    }

    @Override
    public List<Event> getEventsFrom(LocalDate date) {
        return null;
    }
}
