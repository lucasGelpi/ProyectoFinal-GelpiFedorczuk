package com.coderhouse.crudclientes.service;

import com.coderhouse.crudclientes.builder.ProductoBuilder;
import com.coderhouse.crudclientes.dao.ProductoRepository;
import com.coderhouse.crudclientes.handle.ApiException;
import com.coderhouse.crudclientes.modelProducto.ProductoEntity;
import com.coderhouse.crudclientes.modelProducto.ProductoRequest;
import com.coderhouse.crudclientes.modelProducto.ProductoResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductoServiceImpl implements ProductoService {

    private final ProductoRepository productoRepository;

    @Override
    public List<ProductoResponse> buscarProductosTodos() {
        return ProductoBuilder.entityProductoToResponseList(productoRepository.findAll());
    }

    @Override
    public ProductoResponse buscarProducto(long id) {
        ProductoEntity producto = productoRepository.findById(id).orElse(null);
        return ProductoBuilder.entityProductoToResponse(producto);
    }

    @Override
    public ProductoResponse crearProducto(ProductoRequest producto) throws ApiException {
        try {
            if (buscarProducto(producto.getProducto_Id()) == null) {
                ProductoEntity productoEntity = productoRepository.save(ProductoBuilder.requestProductoToEntity(producto));
                return ProductoBuilder.entityProductoToResponse(productoEntity);
            } else {
                throw new ApiException("Producto ya existe");
            }
        } catch (Exception e) {
            throw new ApiException(e.getMessage());
        }
    }

    @Override
    public ProductoResponse actualizarProducto(ProductoRequest producto) throws ApiException {
        try {
            if (buscarProducto(producto.getProducto_Id()) != null) {
                ProductoEntity productoEntity = productoRepository.save(ProductoBuilder.requestProductoToEntity(producto));
                return ProductoBuilder.entityProductoToResponse(productoEntity);
            } else {
                throw new ApiException("Producto no existe");
            }
        } catch (Exception e) {
            throw new ApiException(e.getMessage());
        }
    }

    @Override
    public void eliminarProducto(ProductoRequest producto) {
        productoRepository.delete(ProductoBuilder.requestProductoToEntity(producto));
    }
}