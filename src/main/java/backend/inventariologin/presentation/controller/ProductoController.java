package backend.inventariologin.presentation.controller;

import backend.inventariologin.application.service.ProductoService;
import backend.inventariologin.domain.Producto;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
@RequiredArgsConstructor
public class ProductoController {

    public final ProductoService productoService;

    @GetMapping
    public ResponseEntity<List<Producto>> findAll() {
        return ResponseEntity.ok(productoService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Producto> findById(@PathVariable String id) {
        return ResponseEntity.ok(productoService.findById(Long.valueOf(id)));

    }

    @PostMapping
    public ResponseEntity<Producto> save(@Valid @RequestBody Producto producto) {
        return ResponseEntity.ok(productoService.save(producto));
}
    @PutMapping
    public ResponseEntity<Producto> update(@Valid @RequestBody Producto producto) {
        return ResponseEntity.ok(productoService.update(producto));
    }

    @DeleteMapping("{Id}")
    public ResponseEntity<Producto> delete(@PathVariable String Id) {
        productoService.delete(Long.valueOf(Id));
        return ResponseEntity.noContent().build();
    }

}
