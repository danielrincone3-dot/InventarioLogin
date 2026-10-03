package backend.inventariologin.presentation.controller;

import backend.inventariologin.application.service.MovimientoService;
import backend.inventariologin.domain.Movimiento;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/movimientos")
@RequiredArgsConstructor

public class MovimientoController {

    private final MovimientoService movimientoService;

    @GetMapping
    public ResponseEntity<List<Movimiento>> findAll() {
        return ResponseEntity.ok(movimientoService.findAll());
    }

    @GetMapping("{Id}")
    public ResponseEntity<Movimiento> findById(@PathVariable String Id) {
        return ResponseEntity.ok(movimientoService.findById(Long.valueOf(Id)));
    }

    @PutMapping
    public ResponseEntity<Movimiento> update(@Valid @RequestBody Movimiento movimiento) {
        return ResponseEntity.ok(movimientoService.update(movimiento));
    }

    @DeleteMapping("{Id}")
    public ResponseEntity<Void> deleteById(@PathVariable String Id) {
        movimientoService.delete(Long.valueOf(Id));
        return ResponseEntity.noContent().build();
    }
}
