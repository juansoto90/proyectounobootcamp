package com.nttdata.proyecton1.domain;

//import java.util.Date;

import lombok.Data;

@Data
public class CuentaPlazoFijo {
    public int idCuentaPlazoFijo;
    public double comisionMantenimiento;
    public int limiteMovimientoMensual;
    public String estado;
}
