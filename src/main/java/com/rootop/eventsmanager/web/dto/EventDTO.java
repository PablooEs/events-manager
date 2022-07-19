package com.rootop.eventsmanager.web.dto;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Data
@Builder
public class EventDTO {

    private Long id;
    private String name;
    private Integer assistants;
    private LocalDateTime date;
    private LocalTime duration;
    private BigDecimal price;
    private RoomDTO roomDTO;
}
