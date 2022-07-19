package com.rootop.eventsmanager.data.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Data
@Builder
@Entity
public class EventEntity {

    private Long id;
    private String name;
    private String description;
    private Integer assistants;
    private LocalDateTime date;
    private LocalTime duration;
    private BigDecimal price;
    private RoomEntity room;
}
