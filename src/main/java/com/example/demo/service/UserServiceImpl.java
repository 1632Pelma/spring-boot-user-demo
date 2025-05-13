package com.example.demo.service;

import com.example.demo.repo.FakeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final FakeRepo fakeRepo;

    @Autowired
    public UserServiceImpl(FakeRepo fakeRepo) {
        this.fakeRepo = fakeRepo;
    }

    @Override
    public String addUser(String name, String surname) {
    long id = System.currentTimeMillis() % 1000; // Simple ID gen
    return fakeRepo.insertUser(id, name, surname) + " added";
}

@Override
public String getUser(long id) {
    String name = fakeRepo.findUserById(id);
    return name != null ? "Hello " + name : "User not found";
}

}