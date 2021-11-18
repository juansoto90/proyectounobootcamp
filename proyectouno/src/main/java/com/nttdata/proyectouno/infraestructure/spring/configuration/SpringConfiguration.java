package com.nttdata.proyectouno.infraestructure.spring.configuration;

import com.nttdata.proyectouno.application.model.UserRepository;
import com.nttdata.proyectouno.infraestructure.repository.UserCrudRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {

    @Bean
    public UserRepository repository(){
        return new UserCrudRepository();
    }
}
