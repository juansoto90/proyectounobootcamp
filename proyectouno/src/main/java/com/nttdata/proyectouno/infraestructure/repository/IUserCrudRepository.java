package com.nttdata.proyectouno.infraestructure.repository;

import com.nttdata.proyectouno.infraestructure.model.dao.UserDao;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface IUserCrudRepository extends ReactiveCrudRepository<UserDao, String> {

}
