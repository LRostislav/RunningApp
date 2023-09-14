package com.rost.runningapp.security;

import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;

public class SecurityUtil {
    public static String getSessionUser() {
        Authentication authentication  = SecurityContextHolder.getContext().getAuthentication();
        if (!(authentication instanceof AnonymousAuthenticationToken)) {
            String currentUserEmail = authentication.getName();  //  возвращается почта пользователя
            return currentUserEmail;
        }
        return null;
    }
}
