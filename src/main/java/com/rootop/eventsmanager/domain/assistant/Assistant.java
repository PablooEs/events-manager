package com.rootop.eventsmanager.domain.assistant;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Assistant {
    private Long id;
    private Long assistantID;
    private String name;
    private String lastname;
    private String email;

}
