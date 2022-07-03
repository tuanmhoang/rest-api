package com.tuanmhoang.event.apis.controller.impl;

import com.tuanmhoang.event.apis.controller.EventController;
import com.tuanmhoang.event.apis.service.EventService;
import com.tuanmhoang.event.apis.dtos.EventDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RestController
public class EventControllerImpl implements EventController {

    private final EventService eventService;

    @Override
    public ResponseEntity<EventDto> createAnEvent(EventDto event) {
        log.info(">>> Creating event");
        var createdEvent= eventService.createAnEvent(event);
        return ResponseEntity.ok(createdEvent);
    }

    @Override
    public ResponseEntity<EventDto> findEventById(Integer eventId) {
        log.info(">>> Finding event by ID: {}", eventId);
        var foundEvent = eventService.findEventById(eventId);
        return ResponseEntity.ok(foundEvent);
    }

    @Override
    public ResponseEntity<List<EventDto>> findAllEvents() {
        log.info(">>> Finding all events");
        var events = eventService.findAllEvents();
        return ResponseEntity.ok(events);
    }
}
