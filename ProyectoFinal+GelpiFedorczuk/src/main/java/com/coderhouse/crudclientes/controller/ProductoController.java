package com.coderhouse.crudclientes.controller;

import com.coderhouse.crudclientes.handle.ApiException;
import com.coderhouse.crudclientes.modelProducto.ProductoRequest;
import com.coderhouse.crudclientes.modelProducto.ProductoResponse;
import com.coderhouse.crudclientes.service.ProductoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/productos")
public class ProductoController {

    private final ProductoService productoService;

    @GetMapping()
    public ResponseEntity<List<ProductoResponse>> obtenerProductos() {
        return ResponseEntity.ok(productoService.buscarProductosTodos());
    }

    @GetMapping("/{producto_Id}")
    public ResponseEntity<ProductoResponse> buscarProducto(@PathVariable Long producto_Id) {
        return ResponseEntity.ok(productoService.buscarProducto((producto_Id)));
    }

    @PostMapping("/actualizarProducto")
    public ResponseEntity<ProductoResponse> actualizarProducto(@Valid @RequestBody ProductoRequest producto) throws ApiException {
        return ResponseEntity.ok(productoService.actualizarProducto(producto));
    }

    @PostMapping("/crearProducto")
    public ResponseEntity<ProductoResponse> crearProducto(@Valid @RequestBody ProductoRequest producto) throws ApiException {
        return ResponseEntity.ok(productoService.crearProducto(producto));
    }

    @PostMapping("/eliminarProducto")
    public void eliminarProducto(@Valid @RequestBody ProductoRequest producto) throws ApiException {
        productoService.eliminarProducto(producto);
    }
}