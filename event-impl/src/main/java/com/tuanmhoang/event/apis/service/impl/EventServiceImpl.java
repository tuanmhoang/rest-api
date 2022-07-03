package com.tuanmhoang.event.apis.service.impl;

import com.tuanmhoang.event.apis.entities.Event;
import com.tuanmhoang.event.apis.exceptions.NoDataFoundException;
import com.tuanmhoang.event.apis.repository.EventRepository;
import com.tuanmhoang.event.apis.service.EventService;
import com.tuanmhoang.event.apis.dtos.EventDto;
import com.tuanmhoang.event.apis.service.converter.EventMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Slf4j
@RequiredArgsConstructor
public class EventServiceImpl implements EventService {

    private final EventRepository eventRepository;

    private final EventMapper eventMapper;

    @Override
    public EventDto createAnEvent(EventDto eventDto) {
        log.info(">>> Creating an event");
        Event event = eventMapper.convertFromDtoToEntity(eventDto);
        EventDto createdEvent = eventMapper.convertFromEntityToDto(eventRepository.save(event));
        log.info(">>> Created event successfully!");
        return createdEvent;
    }

    @Override
    public EventDto findEventById(Integer eventId) {
        log.info(">>> Finding event by ID: {}", eventId);
        Optional<Event> event = eventRepository.findById(eventId);
        EventDto eventDto = eventMapper.convertFromEntityToDto(
                event.orElseThrow(() -> new NoDataFoundException("No data found"))
        );
        log.info(">>> Found event: {}", eventDto.getTitle());
        return eventDto;
    }

    @Override
    public List<EventDto> findAllEvents() {
        log.info(">>> Finding all events...");
        var events = eventRepository.findAll();
        if (events.isEmpty()) {
            throw new NoDataFoundException("No data found");
        }
        return events.stream()
                .map(event -> eventMapper.convertFromEntityToDto(event))
                .collect(Collectors.toList());
    }
}
