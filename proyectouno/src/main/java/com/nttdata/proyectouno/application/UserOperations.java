package com.nttdata.proyectouno.application;

import com.nttdata.proyectouno.domain.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public interface UserOperations {

    public Flux<User> queryAll();
    public Mono<User> create(User user);
    public Mono<User> getUser(String username);
    public Mono<User> update(String username, User user);
    public void delete(String username);

}