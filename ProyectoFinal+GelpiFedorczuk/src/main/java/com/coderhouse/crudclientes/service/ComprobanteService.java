package com.coderhouse.crudclientes.service;

import com.coderhouse.crudclientes.modelCompr.ComprobanteRequest;
import com.coderhouse.crudclientes.modelCompr.ComprobanteResponse;
import java.util.List;

public interface ComprobanteService {

    //servicio para buscar todos los comprobantes
    List<ComprobanteResponse> buscarComprobantesTodos();

    //servicio para buscar un comprobante
    ComprobanteResponse buscarComprobante(long id);
}