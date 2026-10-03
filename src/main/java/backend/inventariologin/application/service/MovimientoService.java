package backend.inventariologin.application.service;

import backend.inventariologin.domain.Movimiento;
import backend.inventariologin.domain.Producto;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface MovimientoService {


    @Transactional
    Producto save(Producto producto);

    Movimiento save(Movimiento movimiento);

    List<Movimiento> findAll();

    Movimiento findById(Long id);

    void delete(Long id);

    Movimiento update(Movimiento movimiento);
}