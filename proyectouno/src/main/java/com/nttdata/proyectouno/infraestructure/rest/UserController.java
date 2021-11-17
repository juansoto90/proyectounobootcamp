package com.nttdata.proyectouno.infraestructure.rest;

import com.nttdata.proyectouno.application.UserOperations;
import com.nttdata.proyectouno.domain.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.beans.factory.annotation.Autowire;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserOperations userOperation;
    /*
    @Autowired
    private UserOperations userOperation;
    */


    @GetMapping
    public Flux<User> get(){
        return Flux.fromIterable(userOperation.queryAll());
    }

    @GetMapping("/{username}")
    public Mono<User> getUsername(@PathVariable String username){
        return Mono.justOrEmpty(userOperation.getUsername(username));
    }

    @PostMapping
    public Mono<User> post(@RequestBody User entity){
        return Mono.justOrEmpty(userOperation.create(entity)) ;
    }

    @PutMapping
    public Mono<User> put(@PathVariable String id, @RequestBody User entity){
        return Mono.justOrEmpty(userOperation.update(id, entity));
    }

    @DeleteMapping
    public void delete(@PathVariable String id){
        userOperation.delete(id);
    }

}