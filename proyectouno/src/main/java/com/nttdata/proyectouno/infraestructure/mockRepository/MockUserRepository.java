package com.nttdata.proyectouno.infraestructure.mockRepository;

import com.nttdata.proyectouno.application.model.UserRepository;
import com.nttdata.proyectouno.domain.User;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;

@Component
public class MockUserRepository implements UserRepository {
    @Override
    public Mono<User> getUser(String username) {
        User user = new User();
        user.setUsername("Juan");
        user.setPassword("123");
        user.setStatus("0");
        return Mono.just(user);
    }

    @Override
    public Flux<User> getAll() {
        List<User> users = new ArrayList<>();
        User user = new User();
        user.setUsername("Juan2");
        user.setPassword("1234");
        user.setStatus("1");
        users.add(user);
        return Flux.fromIterable(users);
    }

    @Override
    public Mono<User> save(User user) {
        return Mono.just(user);
    }
}
