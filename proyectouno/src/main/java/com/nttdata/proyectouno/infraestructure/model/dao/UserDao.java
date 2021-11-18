package com.nttdata.proyectouno.infraestructure.model.dao;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("user")
public class UserDao {
    @Id
    private String username;
    private String password;
    private String status;
}
