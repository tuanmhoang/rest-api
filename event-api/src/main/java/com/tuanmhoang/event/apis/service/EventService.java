package com.tuanmhoang.event.apis.service;

import com.tuanmhoang.event.apis.dtos.EventDto;

import java.util.List;

public interface EventService {

    EventDto createAnEvent(EventDto event);

    EventDto findEventById(Integer eventId);

    List<EventDto> findAllEvents();

}
