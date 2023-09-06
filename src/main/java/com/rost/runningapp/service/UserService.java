package com.rost.runningapp.service;

import com.rost.runningapp.dto.RegistrationDto;

public interface UserService {
    void saveUser(RegistrationDto registrationDto);
}
