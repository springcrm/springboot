package com.example.service;

public interface CurrentUserService {
    boolean canAccessUser(CurrentUser currentUser, Long userId);
}