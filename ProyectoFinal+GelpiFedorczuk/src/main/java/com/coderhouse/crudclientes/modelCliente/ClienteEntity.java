package com.coderhouse.crudclientes.modelCliente;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
@Table(name = "CLIENTE")
public class ClienteEntity {

    @Column(name = "NOMBRE")
    private String nombre;

    @Column(name = "APELLIDO")
    private String apellido;

    @Column(name = "DNI")
    @Id
    private long dni;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FECHA_NACIMIENTO")
    private Date fechaNacimiento;
}
