package com.nttdata.proyectouno.application.impl;

import com.nttdata.proyectouno.application.UserOperations;
import com.nttdata.proyectouno.application.model.UserRepository;
import com.nttdata.proyectouno.domain.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserOperationsImpl implements UserOperations {

    @Autowired
    UserRepository repository;

    @Override
    public List<User> queryAll() {
        return repository.getAll();
    }

    @Override
    public User getUsername(String username) {
        return repository.getUsername(username);
    }

    @Override
    public User create(User user) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public User update(String username, User use) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void delete(String username) {
        // TODO Auto-generated method stub
        
    }
    
    
}