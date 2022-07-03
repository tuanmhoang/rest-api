package com.tuanmhoang.event.apis.dtos;

import com.tuanmhoang.event.apis.enums.EventType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventDto  {
    private String title;
    private String place;
    private String speaker;
    private EventType eventType;
    private LocalDateTime dateTime;
}
