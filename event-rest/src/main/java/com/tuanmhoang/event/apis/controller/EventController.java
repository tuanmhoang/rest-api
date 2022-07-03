package com.tuanmhoang.event.apis.controller;

import com.tuanmhoang.event.apis.dtos.EventDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface EventController {

    @PostMapping("/event")
    ResponseEntity<EventDto> createAnEvent(@RequestBody EventDto event);

    @GetMapping("/event/{eventId}")
    ResponseEntity<EventDto> findEventById(@PathVariable Integer eventId);

    @GetMapping("/events")
    ResponseEntity<List<EventDto>> findAllEvents();

}
