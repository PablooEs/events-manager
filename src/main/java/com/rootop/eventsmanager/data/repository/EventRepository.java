package com.rootop.eventsmanager.data.repository;

import com.rootop.eventsmanager.data.entity.EventEntity;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDate;
import java.util.List;

public interface EventRepository extends CrudRepository<EventEntity,Long> {

    List<EventEntity> findByDate(LocalDate date);
    List<EventEntity> findByDateGreaterThanEqual(LocalDate date);

}
