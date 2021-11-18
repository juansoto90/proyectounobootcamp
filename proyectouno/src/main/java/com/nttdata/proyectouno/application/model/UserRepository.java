package com.nttdata.proyectouno.application.model;

import java.util.List;

import com.nttdata.proyectouno.domain.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UserRepository {
    public Mono<User> getUser(String username);
    public Flux<User> getAll();
    public Mono<User> save(User user);
}
