package com.rootop.eventsmanager.domain.room;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Room {

    private Long id;
    private String name;
    private Integer capability;
}
