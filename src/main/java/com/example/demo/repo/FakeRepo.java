package com.example.demo.repo;

import com.example.demo.model.User;
import org.springframework.stereotype.Repository;


@Repository
public class FakeRepo implements FakeRepoInterface {
    private User[] users = new User[10];
    private int size = 0;

    @Override
    public String insertUser(long id, String name, String surname) {
    User user = new User(id, name, surname);
    users[size++] = user;
    return name;
}
}