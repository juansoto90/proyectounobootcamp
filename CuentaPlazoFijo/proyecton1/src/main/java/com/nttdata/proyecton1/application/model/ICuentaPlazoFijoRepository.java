package com.nttdata.proyecton1.application.model;

import com.nttdata.proyecton1.domain.CuentaPlazoFijo;

import reactor.core.publisher.Mono;

public interface ICuentaPlazoFijoRepository {
    public Mono<CuentaPlazoFijo> get(int idCuentaPlazoFijo);
    public Mono<CuentaPlazoFijo> create(CuentaPlazoFijo cuentaPlazoFijo);
    public Mono<CuentaPlazoFijo> update(CuentaPlazoFijo cuentaPlazoFijo);
    public void delete(int idCuentaPlazoFijo);
}
