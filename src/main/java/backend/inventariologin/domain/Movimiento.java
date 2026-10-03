package backend.inventariologin.domain;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;
import  backend.inventariologin.domain.Movimiento;

@Entity
@Table(name = "productos")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Movimiento {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull(message = "Producto: obligatorio")
    @JoinColumn(name = "producto_id",  nullable = false)
    private String producto;

    @Min(value = 1)
    @NonNull
    private int cantidad;


    private TipoMovimiento tipoMovimientoipo;


}
