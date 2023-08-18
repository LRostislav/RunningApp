package com.rost.runningapp.repository;

import com.rost.runningapp.models.Club;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClubRepository extends JpaRepository<Club, Long> {
    
}
