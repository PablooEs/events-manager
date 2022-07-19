package com.rootop.eventsmanager.web.utils.mapper;

import com.rootop.eventsmanager.domain.event.Event;
import com.rootop.eventsmanager.domain.room.Room;
import com.rootop.eventsmanager.web.dto.EventDTO;
import com.rootop.eventsmanager.web.dto.RoomDTO;
import org.springframework.stereotype.Service;

@Service
public class Mapper {

    public EventDTO toEventDTO(Event event){
        return EventDTO.builder()
                .id(event.getId())
                .date(event.getDate())
                .assistants(event.getAssistants())
                .duration(event.getDuration())
                .price(event.getPrice())
                .roomDTO(toRoomDTO(event.getRoom()))
                .build();
    }

    public RoomDTO toRoomDTO(Room room){
        return RoomDTO.builder()
                .id(room.getId())
                .name(room.getName())
                .capability(room.getCapability()).build();
    }
}
