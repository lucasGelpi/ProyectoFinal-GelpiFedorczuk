package com.coderhouse.crudclientes.service;

import com.coderhouse.crudclientes.handle.ApiException;
import com.coderhouse.crudclientes.modelCliente.ClienteRequest;
import com.coderhouse.crudclientes.modelCliente.ClienteResponse;

import java.util.List;

public interface ClienteService {

    //Servicio para buscar un Cliente
    ClienteResponse buscarPorDni(Long dni);

    //Servicio para buscar todos los Clientes
    List<ClienteResponse> buscarTodos();

    //Servicio para crear un Cliente
    ClienteResponse crearCliente(ClienteRequest cliente) throws ApiException;

    //Servicio para actualizar un Cliente
    ClienteResponse actualizarCliente(ClienteRequest cliente) throws ApiException;

    //Servicio para eliminar un Cliente
    void eliminarCliente(ClienteRequest cliente);
}