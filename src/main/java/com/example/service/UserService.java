package com.example.service;

import java.util.Collection;
import java.util.Optional;

import com.example.entity.User;

public interface UserService {

    Optional<User> getUserById(long id);

    Optional<User> getUserByEmail(String email);

    Collection<User> getAllUsers();


}