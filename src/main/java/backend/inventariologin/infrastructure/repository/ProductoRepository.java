package backend.inventariologin.infrastructure.repository;

import backend.inventariologin.domain.Producto;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long>{

    Optional<Producto> findByNombre(String nombre);
};
