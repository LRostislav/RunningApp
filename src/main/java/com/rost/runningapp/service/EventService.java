package com.rost.runningapp.service;

import com.rost.runningapp.dto.EventDto;

public interface EventService {
    void createEvent(Long clubId, EventDto eventDto);
}
