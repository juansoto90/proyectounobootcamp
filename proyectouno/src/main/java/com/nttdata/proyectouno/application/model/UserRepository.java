package com.nttdata.proyectouno.application.model;

import java.util.List;

import com.nttdata.proyectouno.domain.User;

public interface UserRepository {
    public User getUsername(String username);
    public List<User> getAll();
}
