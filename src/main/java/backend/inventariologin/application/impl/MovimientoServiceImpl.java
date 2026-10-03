package backend.inventariologin.application.impl;
import backend.inventariologin.application.service.MovimientoService;
import backend.inventariologin.domain.Producto;
import backend.inventariologin.domain.Movimiento;
import backend.inventariologin.infrastructure.exception.DuplicateResourceException;
import backend.inventariologin.infrastructure.exception.ResourceNotFoundException;
import backend.inventariologin.infrastructure.repository.ProductoRepository;
import backend.inventariologin.infrastructure.repository.MovimientoRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Repository
@Primary

public class MovimientoServiceImpl implements MovimientoService {

    private final MovimientoRepository movimientoRepository;
    private final ProductoRepository productoRepository;

    @Transactional
    @Override
    public Producto save(Producto producto) {
        if (productoRepository.findByNombre(producto.getNombre()).isPresent()) {
            throw new DuplicateResourceException("Ya existe un producto con el nombre: " + producto.getNombre());
        }

        return productoRepository.save(producto);
    }

    @Override
    public Movimiento save(Movimiento movimiento) {
        return null;
    }


    @Override
    public List<Movimiento> findAll() {
        return movimientoRepository.findAll();
    }

    @Override
    public Movimiento findById(Long id) {
        return movimientoRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Movimiento no encontrado con id:"  + id));


    }

    @Override
   public void delete(Long id) {
        Movimiento movimiento = findById(id);
        movimientoRepository.delete(movimiento);
    }


    @Override
    public Movimiento update(Movimiento movimiento) {
        findById((long) movimiento.getId());
        return movimientoRepository.save(movimiento);
    }

}
