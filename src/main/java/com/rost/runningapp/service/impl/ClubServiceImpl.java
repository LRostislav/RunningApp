package com.rost.runningapp.service.impl;

import com.rost.runningapp.dto.ClubDto;
import com.rost.runningapp.models.Club;
import com.rost.runningapp.repository.ClubRepository;
import com.rost.runningapp.service.ClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClubServiceImpl implements ClubService {
    private ClubRepository clubRepository;

    @Autowired
    public ClubServiceImpl(ClubRepository clubRepository) {
        this.clubRepository = clubRepository;
    }

    @Override
    public List<ClubDto> findAllClubs() {
        List<Club> clubs = clubRepository.findAll();
        return clubs.stream().map((club) -> mapToClubDto(club)).collect(Collectors.toList());
    }


    @Override
    public Club saveClub(ClubDto clubDto) {
        Club club = mapToClub(clubDto);
        return clubRepository.save(club);
    }


    @Override
    public ClubDto findClubById(Long clubId) {
        Club club = clubRepository.findById(clubId).get();
        return mapToClubDto(club);
    }


    @Override
    public void updateClub(ClubDto clubDto) {
        Club club = mapToClub(clubDto);
        clubRepository.save(club);
    }

    private Club mapToClub(ClubDto clubDto) {
        Club club = Club.builder()
                .id(clubDto.getId())
                .title(clubDto.getTitle())
                .photoUrl(clubDto.getPhotoUrl())
                .content(clubDto.getContent())
                .createdOn(clubDto.getCreatedOn())
                .updatedOn(clubDto.getUpdatedOn())
                .build();
        return club;
    }

    private ClubDto mapToClubDto(Club club) {
        ClubDto clubDto = ClubDto.builder()
                .id(club.getId())
                .title(club.getTitle())
                .photoUrl(club.getPhotoUrl())
                .content(club.getContent())
                .createdOn(club.getCreatedOn())
                .updatedOn(club.getUpdatedOn())
                .build();
        return clubDto;
    }
}
