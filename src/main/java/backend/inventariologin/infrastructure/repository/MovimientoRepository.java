package backend.inventariologin.infrastructure.repository;
import backend.inventariologin.domain.Movimiento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovimientoRepository extends JpaRepository<Movimiento, Long> {

}
