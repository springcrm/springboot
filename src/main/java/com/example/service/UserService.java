package com.example.service;



import java.util.Collection;
import java.util.Optional;

import com.example.domain.User;
import com.example.domain.UserCreateForm;

public interface UserService {

    Optional<User> getUserById(long id);

    Optional<User> getUserByEmail(String email);

    Collection<User> getAllUsers();

    User create(UserCreateForm form);

}
