package com.rost.runningapp.repository;

import com.rost.runningapp.models.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}
