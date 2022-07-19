package com.coderhouse.crudclientes.service;

import com.coderhouse.crudclientes.handle.ApiException;
import com.coderhouse.crudclientes.modelProducto.ProductoRequest;
import com.coderhouse.crudclientes.modelProducto.ProductoResponse;
import java.util.List;

public interface ProductoService {

    //Servicio para buscar un Producto
    ProductoResponse buscarProducto(long id);

    //Servicio para buscar todos los Productos
    List<ProductoResponse> buscarProductosTodos();

    //Servicio para crear un Producto
    ProductoResponse crearProducto(ProductoRequest producto) throws ApiException;

    //Servicio para actualizar un Producto
    ProductoResponse actualizarProducto(ProductoRequest producto) throws ApiException;

    //Servicio para eliminar un Producto
    void eliminarProducto(ProductoRequest producto);
}