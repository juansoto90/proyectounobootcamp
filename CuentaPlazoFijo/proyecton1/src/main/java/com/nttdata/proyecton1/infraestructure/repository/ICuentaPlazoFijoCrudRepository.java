package com.nttdata.proyecton1.infraestructure.repository;

import com.nttdata.proyecton1.infraestructure.model.dao.CuentaPlazoFijoDao;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ICuentaPlazoFijoCrudRepository extends ReactiveCrudRepository<CuentaPlazoFijoDao, Integer> {
    
}
