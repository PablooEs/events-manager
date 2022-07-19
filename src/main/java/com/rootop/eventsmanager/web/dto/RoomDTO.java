package com.rootop.eventsmanager.web.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RoomDTO {

    private Long id;
    private String name;
    private Integer capability;
}
