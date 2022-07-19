package com.rootop.eventsmanager.domain.ticket;

import com.rootop.eventsmanager.domain.assistant.Assistant;
import com.rootop.eventsmanager.domain.event.Event;
import lombok.Builder;
import lombok.Data;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import java.math.BigDecimal;

@Data
@Builder
public class Ticket {

    private Long id;
    private BigDecimal price;
    @NonNull
    private Event event;
    @Nullable
    private Assistant assistant;
    private State state;
}
