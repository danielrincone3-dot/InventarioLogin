package backend.inventariologin.application.service;
import backend.inventariologin.domain.Producto;
import java.util.List;


public interface ProductoService {

    //Save
    Producto save(Producto producto);

    List<Producto> findAll();

    Producto findById(Long id);

    void delete(Long id);

    Producto update(Producto producto);



}
