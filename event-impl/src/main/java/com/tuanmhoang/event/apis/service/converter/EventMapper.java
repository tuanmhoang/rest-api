package com.tuanmhoang.event.apis.service.converter;

import com.tuanmhoang.event.apis.dtos.EventDto;
import com.tuanmhoang.event.apis.entities.Event;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EventMapper {

    EventDto convertFromEntityToDto(Event event);

    Event convertFromDtoToEntity(EventDto eventDto);
}
