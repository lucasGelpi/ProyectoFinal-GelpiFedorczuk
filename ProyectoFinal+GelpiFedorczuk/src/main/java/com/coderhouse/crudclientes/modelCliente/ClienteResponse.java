package com.coderhouse.crudclientes.modelCliente;

import lombok.*;

@Data
@Builder
public class ClienteResponse {

    private String nombre;
    private String apellido;
    private long dni;
    private int edad;
}