package com.coderhouse.crudclientes.builder;

import com.coderhouse.crudclientes.modelProducto.ProductoEntity;
import com.coderhouse.crudclientes.modelProducto.ProductoRequest;
import com.coderhouse.crudclientes.modelProducto.ProductoResponse;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ProductoBuilder {

    public static ProductoResponse entityProductoToResponse(ProductoEntity producto) {
        if (Objects.nonNull(producto)) {
            return ProductoResponse.builder()
                    .producto_Id(producto.getProducto_Id())
                    .stock(producto.getStock())
                    .descripcion(producto.getDescripcion())
                    .precio(producto.getPrecio())
                    .build();
        }
        return null;
    }

    public static List<ProductoResponse> entityProductoToResponseList(List<ProductoEntity> entityProductoList) {
        return entityProductoList.stream().map(ProductoBuilder::entityProductoToResponse).collect(Collectors.toList());
    }

    public static ProductoEntity requestProductoToEntity(ProductoRequest producto) {
        if (Objects.nonNull(producto)) {
            return ProductoEntity.builder()
                    .producto_Id(producto.getProducto_Id())
                    .stock(producto.getStock())
                    .descripcion(producto.getDescripcion())
                    .precio(producto.getPrecio())
                    .build();
        }
        return null;
    }
}