package com.nttdata.proyectouno.application;

import com.nttdata.proyectouno.domain.User;

import java.util.List;

public interface UserOperations {

    public List<User> queryAll();
    public User create(User user);
    public User getUsername(String username);
    public User update(String username, User user);
    public void delete(String username);

}