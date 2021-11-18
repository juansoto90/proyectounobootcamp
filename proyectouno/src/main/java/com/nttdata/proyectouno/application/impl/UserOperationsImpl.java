package com.nttdata.proyectouno.application.impl;

import com.nttdata.proyectouno.application.UserOperations;
import com.nttdata.proyectouno.application.model.UserRepository;
import com.nttdata.proyectouno.domain.User;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserOperationsImpl implements UserOperations {

    /*@Autowired
    UserRepository repository;*/

    private final UserRepository repository;

    @Override
    public Flux<User> queryAll() {
        return repository.getAll();
    }

    @Override
    public Mono<User> getUser(String username) {
        return repository.getUser(username);
    }

    @Override
    public Mono<User> create(User user) {
        return repository.save(user);
    }

    @Override
    public Mono<User> update(String username, User use) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void delete(String username) {
        // TODO Auto-generated method stub
        
    }
    
    
}