package com.coderhouse.crudclientes.controller;

import com.coderhouse.crudclientes.handle.ApiException;
import com.coderhouse.crudclientes.modelCliente.ClienteRequest;
import com.coderhouse.crudclientes.modelCliente.ClienteResponse;
import com.coderhouse.crudclientes.service.ClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/clientes")
public class ClienteController {

    private final ClienteService clienteService;

    @GetMapping()
    public ResponseEntity<List<ClienteResponse>> obtenerClientes() {
        return ResponseEntity.ok(clienteService.buscarTodos());
    }

    @GetMapping("/{dni}")
    public ResponseEntity<ClienteResponse> buscarClientePorDni(@PathVariable Long dni) {
        return ResponseEntity.ok(clienteService.buscarPorDni(dni));
    }

    @PostMapping("/actualizar")
    public ResponseEntity<ClienteResponse> actualizarCliente(@Valid @RequestBody ClienteRequest cliente) throws ApiException {
        return ResponseEntity.ok(clienteService.actualizarCliente(cliente));
    }

    @PostMapping("/crear")
    public ResponseEntity<ClienteResponse> crearCliente(@Valid @RequestBody ClienteRequest cliente) throws ApiException {
        return ResponseEntity.ok(clienteService.crearCliente(cliente));
    }

    @PostMapping("/eliminar")
    public void eliminar(@Valid @RequestBody ClienteRequest cliente) throws ApiException {
        clienteService.eliminarCliente(cliente);
    }
}