package com.nttdata.proyecton1.application.impl;

import com.nttdata.proyecton1.application.ICuentaPlazoFijoOperationReactive;
import com.nttdata.proyecton1.application.model.ICuentaPlazoFijoRepository;
import com.nttdata.proyecton1.domain.CuentaPlazoFijo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class CuentaPlazoFijoOperationReactiveImpl implements ICuentaPlazoFijoOperationReactive {

    private final ICuentaPlazoFijoRepository repository;

    @Override
    public Mono<CuentaPlazoFijo> get(int idCuentaPlazoFijo) {
        return repository.get(idCuentaPlazoFijo);
    }

    @Override
    public Mono<CuentaPlazoFijo> create(CuentaPlazoFijo cuentaPlazoFijo) {
        return repository.create(cuentaPlazoFijo);
    }

    @Override
    public Mono<CuentaPlazoFijo> update(CuentaPlazoFijo cuentaPlazoFijo) {
        return repository.update(cuentaPlazoFijo);
    }

    @Override
    public void delete(int idCuentaPlazoFijo) {
        repository.delete(idCuentaPlazoFijo);
    }
}
