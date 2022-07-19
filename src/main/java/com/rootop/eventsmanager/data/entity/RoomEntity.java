package com.rootop.eventsmanager.data.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;

@Data
@Builder
@Entity
public class RoomEntity {

    private Long id;
    private String name;
    private Integer capability;
}
