package com.rootop.eventsmanager.domain.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Service
public class EventServiceImpl implements EventService{

    private final EventGateway eventGateway;

    @Autowired
    public EventServiceImpl(EventGateway eventGateway) {
        this.eventGateway = eventGateway;
    }

    public List<Event> getEvents(String date){
        List<Event> events = new ArrayList<>();
        if(date.equals("since")){
            events = eventGateway.getEventsSince(LocalDate.now());
        }
        else{
            switch (date){
                case "today":{
                    events = eventGateway.getEventsFrom(LocalDate.now());
                    break;
                }
                case "tomorrow":{
                    events = eventGateway.getEventsFrom(LocalDate.now().plusDays(1));
                    break;
                }
                case "past":{
                    events = eventGateway.getEventsFrom(LocalDate.now().minusDays(1));
                    break;
                }
                default:{
                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
                    try{
                        LocalDate localDate = LocalDate.parse(date, formatter);
                        events = eventGateway.getEventsFrom(localDate);
                    }catch (Exception e){
                        System.out.println("Excepcion al formatear date");
                        events = eventGateway.getEventsFrom(LocalDate.now());
                    }
                }

            }
        }
        return events;
    }
}
