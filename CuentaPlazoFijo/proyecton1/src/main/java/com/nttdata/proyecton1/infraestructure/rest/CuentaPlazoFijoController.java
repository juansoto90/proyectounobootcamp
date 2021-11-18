package com.nttdata.proyecton1.infraestructure.rest;

import com.nttdata.proyecton1.application.ICuentaPlazoFijoOperationReactive;
import com.nttdata.proyecton1.domain.CuentaPlazoFijo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("cpf")
@RequiredArgsConstructor
public class CuentaPlazoFijoController {

    private final ICuentaPlazoFijoOperationReactive iCuentaPlazoFijoOperationReactive;

    @GetMapping("/{id}")
    public Mono<CuentaPlazoFijo> get(@PathVariable int id){
        return iCuentaPlazoFijoOperationReactive.get(id);
    }

    @PostMapping
    public Mono<CuentaPlazoFijo> create(@RequestBody CuentaPlazoFijo cuentaPlazoFijo){
        return iCuentaPlazoFijoOperationReactive.create(cuentaPlazoFijo);
    }

    @PutMapping
    public Mono<CuentaPlazoFijo> update(@RequestBody CuentaPlazoFijo cuentaPlazoFijo){
        return iCuentaPlazoFijoOperationReactive.update(cuentaPlazoFijo);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        iCuentaPlazoFijoOperationReactive.delete(id);
    }
}
