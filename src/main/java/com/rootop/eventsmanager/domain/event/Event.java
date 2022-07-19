package com.rootop.eventsmanager.domain.event;

import com.rootop.eventsmanager.domain.room.Room;
import com.rootop.eventsmanager.domain.ticket.Ticket;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

@Data
@Builder
public class Event {

    private Long id;
    private String name;
    private String description;
    private LocalDateTime date;
    private LocalTime duration;
    private List<Ticket> tickets;
    private Room room;
    private Integer ticketsSelled;
    private Integer ticketsAvailable;
    private Integer ticketsTotal;

}
