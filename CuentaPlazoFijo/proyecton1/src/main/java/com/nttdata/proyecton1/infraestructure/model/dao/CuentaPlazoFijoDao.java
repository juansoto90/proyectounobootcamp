package com.nttdata.proyecton1.infraestructure.model.dao;

//import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document("CuentaPlazoFijo")
public class CuentaPlazoFijoDao {
    @Id
    public int idCuentaPlazoFijo;
    public double comisionMantenimiento;
    public int limiteMovimientoMensual;
    public String estado;
}
