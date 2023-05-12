package com.example.hw20_docker.service;

import com.example.hw20_docker.entity.User;

import java.util.List;

public interface UserService {
    User create(User user);

    List<User> getAll();

    User findUserById(Long id);
}
