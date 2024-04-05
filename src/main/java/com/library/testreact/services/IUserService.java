package com.library.testreact.services;

import com.library.testreact.entities.User;

import java.util.List;

public interface IUserService {
    List<User> getAllUsers();

    User getUserById(Long id);

    void createUser(User user);

    void updateUser(Long id, User user);

    void deleteUser(Long id);
}
