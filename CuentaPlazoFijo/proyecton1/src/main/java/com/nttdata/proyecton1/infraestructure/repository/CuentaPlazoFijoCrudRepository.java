package com.nttdata.proyecton1.infraestructure.repository;

import com.nttdata.proyecton1.application.model.ICuentaPlazoFijoRepository;
import com.nttdata.proyecton1.domain.CuentaPlazoFijo;
import com.nttdata.proyecton1.infraestructure.model.dao.CuentaPlazoFijoDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import reactor.core.publisher.Mono;

@Component
public class CuentaPlazoFijoCrudRepository implements ICuentaPlazoFijoRepository {

    @Autowired
    ICuentaPlazoFijoCrudRepository iCuentaPlazoFijoCrudRepository;

    @Override
    public Mono<CuentaPlazoFijo> get(int id) {
        return iCuentaPlazoFijoCrudRepository.findById(id)
                .map(this::mapCuentaPlazoFijoDaoToCuentaPlazoFijo);
    }

    @Override
    public Mono<CuentaPlazoFijo> create(CuentaPlazoFijo cuentaPlazoFijo) {
        return iCuentaPlazoFijoCrudRepository.save(mapCuentaPlazoFijoToCuentaPlazoFijoDao(cuentaPlazoFijo))
                .map(this::mapCuentaPlazoFijoDaoToCuentaPlazoFijo);
    }

    @Override
    public Mono<CuentaPlazoFijo> update(CuentaPlazoFijo cuentaPlazoFijo) {
        return iCuentaPlazoFijoCrudRepository.save(mapCuentaPlazoFijoToCuentaPlazoFijoDao(cuentaPlazoFijo))
                .map(this::mapCuentaPlazoFijoDaoToCuentaPlazoFijo);
    }

    @Override
    public void delete(int id) {
        iCuentaPlazoFijoCrudRepository.deleteById(id);
    }

    private CuentaPlazoFijo mapCuentaPlazoFijoDaoToCuentaPlazoFijo(CuentaPlazoFijoDao cDao){
        CuentaPlazoFijo c = new CuentaPlazoFijo();
        c.setIdCuentaPlazoFijo(cDao.getIdCuentaPlazoFijo());
        c.setComisionMantenimiento(cDao.getComisionMantenimiento());
        c.setLimiteMovimientoMensual(cDao.getLimiteMovimientoMensual());
        c.setEstado(cDao.getEstado());
        return c;
    }

    private CuentaPlazoFijoDao mapCuentaPlazoFijoToCuentaPlazoFijoDao(CuentaPlazoFijo c){
        CuentaPlazoFijoDao cDao = new CuentaPlazoFijoDao();
        cDao.setIdCuentaPlazoFijo(c.getIdCuentaPlazoFijo());
        cDao.setComisionMantenimiento(c.getComisionMantenimiento());
        cDao.setLimiteMovimientoMensual(c.getLimiteMovimientoMensual());
        cDao.setEstado(c.getEstado());
        return cDao;
    }
    
}
