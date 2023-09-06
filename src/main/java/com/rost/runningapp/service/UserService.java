package com.rost.runningapp.service;

import com.rost.runningapp.dto.RegistrationDto;
import com.rost.runningapp.models.UserEntity;
import org.springframework.stereotype.Service;

public interface UserService {
    void saveUser(RegistrationDto registrationDto);

    UserEntity findByEmail(String email);

    UserEntity findByUsername(String username);
}
