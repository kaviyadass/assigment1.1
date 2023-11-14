package com.example.demo.service;

import com.example.demo.model.User;

public interface UserService {
    User createUser(User user);
    User findUserById(Long id);
    User updateUser(Long id, User user);
    void deleteUser(Long id);
}
