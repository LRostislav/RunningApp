package com.rost.runningapp.service;

import com.rost.runningapp.dto.ClubDto;

import java.util.List;

public interface ClubService {
    List<ClubDto> findAllClubs();
}
