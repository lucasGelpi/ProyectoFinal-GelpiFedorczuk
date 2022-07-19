package com.coderhouse.crudclientes.modelProducto;

import lombok.*;

@Data
@Builder
public class ProductoResponse {

    private long producto_Id;
    private Integer stock;
    private String descripcion;
    private Integer precio;
}