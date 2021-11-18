package com.nttdata.proyecton1.infraestructure.spring.configuration;

import com.nttdata.proyecton1.application.model.ICuentaPlazoFijoRepository;
import com.nttdata.proyecton1.infraestructure.repository.CuentaPlazoFijoCrudRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {

    @Bean
    public ICuentaPlazoFijoRepository repository(){
        return new CuentaPlazoFijoCrudRepository();
    }
}
