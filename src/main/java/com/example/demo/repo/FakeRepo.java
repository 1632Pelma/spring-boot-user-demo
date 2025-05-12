package com.example.demo.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.model.User;


@Repository
public class FakeRepo implements FakeRepoInterface {

    @SuppressWarnings("FieldMayBeFinal")
    private User[] users = new User[10];
    private int size = 0;

    @Override
    public String insertUser(long id, String name, String surname) {
    User user = new User(id, name, surname);
    users[size++] = user;
    return name;
}
@Override
public String findUserById(long id) {
    for (User u : users) {
        if (u != null && u.getId() == id) {
            return u.getName();
        }
    }
    return null;
}

 @Override
    public String deleteUser(long id) {
        for (int i = 0; i < size; i++) {
            if (users[i].getId() == id) {
                String name = users[i].getName();
                System.arraycopy(users, i+1, users, i, size-i-1);
                users[--size] = null;
                return name;
            }
        }
        return null;
    }
}