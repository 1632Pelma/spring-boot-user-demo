package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public interface UserService {
    String addUser(String name, String surname);
    String removeUser(long id);
    String getUser(long id);
}