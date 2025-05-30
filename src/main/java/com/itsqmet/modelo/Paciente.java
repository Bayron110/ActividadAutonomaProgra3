package com.itsqmet.modelo;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Paciente {

    @Size(min=5, max=15)
    private String nombre;

    @Size(min=5, max=15)
    private String apellido;

    @NotNull
    private String edad;

    @DateTimeFormat (pattern = "yyyy-mm-dd")
    private Date fechaNacimiento;

    @NotNull
    private String genero;

    @Size(min=15, max=100)
    private String direccion;

    @Size(min=15, max=100)
    private String consultaMed;

    @Size(min=1, max=2)
    private String alergiaT;

    @Size(min=1, max=2)
    private String hisClinica;

    @NotBlank (message = "debe seleccionar uno")
    private String tratamiento;

}
