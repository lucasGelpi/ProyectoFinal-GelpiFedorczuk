package com.coderhouse.crudclientes.modelProducto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@Builder
@Data
@Entity
@Table(name = "PRODUCTO")
@NoArgsConstructor
public class ProductoEntity {

    @Column(name = "PRODUCTO_ID")
    @Id
    private long producto_Id;

    @Column(name = "STOCK")
    private Integer stock;

    @Column(name = "DESCRIPCION")
    private String descripcion;

    @Column(name = "PRECIO")
    private Integer precio;
}