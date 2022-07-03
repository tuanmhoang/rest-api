package com.tuanmhoang.event.apis.entities;

import com.tuanmhoang.event.apis.enums.EventType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String place;
    private String speaker;

    @Enumerated(EnumType.STRING)
    private EventType eventType;

    private LocalDateTime dateTime;
}
