package com.nttdata.proyectouno.infraestructure.rest.mockRepository;

import com.nttdata.proyectouno.application.model.UserRepository;
import com.nttdata.proyectouno.domain.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MockUserRepository implements UserRepository {
    @Override
    public User getUsername(String username) {
        User user = new User();
        user.setUsername("Juan");
        user.setPassword("123");
        user.setStatus("0");
        return user;
    }

    @Override
    public List<User> getAll() {
        List<User> users = new ArrayList<>();
        User user = new User();
        user.setUsername("Juan2");
        user.setPassword("1234");
        user.setStatus("1");
        users.add(user);
        return users;
    }
}
