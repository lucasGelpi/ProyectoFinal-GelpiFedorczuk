package com.coderhouse.crudclientes.modelProducto;

import lombok.Data;
import org.springframework.validation.annotation.Validated;

@Data
@Validated
public class ProductoRequest {

    private long producto_Id;
    private Integer stock;
    private String descripcion;
    private Integer precio;
}