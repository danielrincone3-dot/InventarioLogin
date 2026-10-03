package backend.inventariologin.application.impl;
import backend.inventariologin.domain.Producto;
import backend.inventariologin.application.service.ProductoService;
import java.util.Optional;
import java.util.List;

import backend.inventariologin.infrastructure.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class ProductoServiceImpl  implements ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public Producto save(Producto producto) {
        return null;
    }

    @Override
    public List<Producto> findAll() {
        return null;
    }

    @Override
    public Producto findById(Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Producto update(Producto producto) {
        return null;
    }

    ;

}
