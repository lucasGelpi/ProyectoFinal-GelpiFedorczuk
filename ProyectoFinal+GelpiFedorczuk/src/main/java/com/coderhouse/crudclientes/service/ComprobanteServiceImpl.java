package com.coderhouse.crudclientes.service;

import com.coderhouse.crudclientes.builder.ComprobanteBuilder;
import com.coderhouse.crudclientes.dao.ComprobanteRepository;
import com.coderhouse.crudclientes.modelCompr.ComprobanteEntity;
import com.coderhouse.crudclientes.modelCompr.ComprobanteResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ComprobanteServiceImpl implements ComprobanteService {

    private final ComprobanteRepository comprobanteRepository;

    @Override
    public List<ComprobanteResponse> buscarComprobantesTodos() {
        return ComprobanteBuilder.entityComprobanteToResponseList(comprobanteRepository.findAll());
    }

    @Override
    public ComprobanteResponse buscarComprobante(long id) {
        ComprobanteEntity comprobante = comprobanteRepository.findById(id).orElse(null);
        return ComprobanteBuilder.entityComprobanteToResponse(comprobante);
    }
}