package com.example.hw20_docker.service;

import com.example.hw20_docker.entity.User;
import com.example.hw20_docker.exception.UserNotFoundException;
import com.example.hw20_docker.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;


    @Override
    public User create(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAll() {
        return (List<User>) userRepository.findAll();
    }

    @Override
    public User findUserById(Long id) {
        return userRepository.findById(id).orElseThrow(()->new UserNotFoundException("Such user is not found"));
    }
}
