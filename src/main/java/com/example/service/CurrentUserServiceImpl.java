package com.example.service;

import org.springframework.stereotype.Service;

import com.example.domain.CurrentUser;
import com.example.domain.Role;

@Service
public class CurrentUserServiceImpl implements CurrentUserService {

    @Override
    public boolean canAccessUser(CurrentUser currentUser, Long userId) {
        return currentUser != null
                && (currentUser.getRole() == Role.ADMIN || currentUser.getId().equals(userId));
    }

}