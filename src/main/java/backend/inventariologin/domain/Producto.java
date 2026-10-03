package backend.inventariologin.domain;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Entity
@Table(name = "productos")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "El nombre es obligatorio")
    @Size(max = 100, message = "No debe superar los 100 caracteres")
    @Column(nullable = false, length = 100)
    private String nombre;

    @Size(max = 250, message = "máximo 255 caracteres")
    @Column(nullable = false, length = 250)
    private String descripcion;

    @NonNull
    @Column(nullable = false)
    private double precio;

    @NonNull
    @Column(nullable = false)
    private int stock;
}
