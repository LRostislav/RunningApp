package com.rost.runningapp.service;

import com.rost.runningapp.dto.ClubDto;
import com.rost.runningapp.models.Club;

import java.util.List;

public interface ClubService {
    List<ClubDto> findAllClubs();

    Club saveClub(ClubDto clubDto);

    ClubDto findClubById(Long clubId);

    void updateClub(ClubDto club);

    void delete(Long clubId);
}
