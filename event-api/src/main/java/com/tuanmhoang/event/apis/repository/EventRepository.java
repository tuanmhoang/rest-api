package com.tuanmhoang.event.apis.repository;

import com.tuanmhoang.event.apis.entities.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Integer> {
}
