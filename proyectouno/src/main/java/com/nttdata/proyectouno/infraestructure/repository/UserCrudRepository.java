package com.nttdata.proyectouno.infraestructure.repository;

import com.nttdata.proyectouno.application.model.UserRepository;
import com.nttdata.proyectouno.domain.User;
import com.nttdata.proyectouno.infraestructure.model.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@Component
public class UserCrudRepository implements UserRepository {

    @Autowired
    IUserCrudRepository iUserCrudRepository;

    @Override
    public Mono<User> getUser(String username) {
        return iUserCrudRepository.findById(username)
                .map(this::mapUserDaoToUser);
    }

    @Override
    public Flux<User> getAll() {
        return iUserCrudRepository.findAll()
                .map(this::mapUserDaoToUser);
    }

    @Override
    public Mono<User> save(User user) {
        return iUserCrudRepository.save(mapUserToUserDao(user))
                .map(this::mapUserDaoToUser);
    }

    private User mapUserDaoToUser(UserDao userDao){
        User user = new User();
        user.setUsername(userDao.getUsername());
        user.setPassword(userDao.getPassword());
        user.setStatus(userDao.getStatus());
        return user;
    }

    private UserDao mapUserToUserDao(User user){
        UserDao userDao = new UserDao();
        userDao.setUsername(user.getUsername());
        userDao.setPassword(user.getPassword());
        userDao.setStatus(user.getStatus());
        return userDao;
    }
}
