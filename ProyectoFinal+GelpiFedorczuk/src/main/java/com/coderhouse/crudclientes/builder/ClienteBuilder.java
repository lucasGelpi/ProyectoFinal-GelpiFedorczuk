package com.coderhouse.crudclientes.builder;

import com.coderhouse.crudclientes.modelCliente.ClienteEntity;
import com.coderhouse.crudclientes.modelCliente.ClienteRequest;
import com.coderhouse.crudclientes.modelCliente.ClienteResponse;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ClienteBuilder {

    public static ClienteResponse entityToResponse(ClienteEntity cliente) {
        if (Objects.nonNull(cliente)) {
            return ClienteResponse.builder()
                    .dni(cliente.getDni())
                    .apellido(cliente.getApellido())
                    .nombre(cliente.getNombre())
                    .edad(getEdadByFechaNacimiento(cliente.getFechaNacimiento()))
                    .build();
        }
        return null;
    }

    public static List<ClienteResponse> entityToResponseList(List<ClienteEntity> entityList) {
        return entityList.stream().map(ClienteBuilder::entityToResponse).collect(Collectors.toList());
    }

    private static int getEdadByFechaNacimiento(Date fechaNac) {
        LocalDate anioNac = fechaNac.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
        LocalDate anioActual = LocalDate.now();

        return Period.between(anioNac, anioActual).getYears();
    }

    public static ClienteEntity requestToEntity(ClienteRequest cliente) {
        if (Objects.nonNull(cliente)) {
            return ClienteEntity.builder()
                    .dni(cliente.getDni())
                    .apellido(cliente.getApellido())
                    .nombre(cliente.getNombre())
                    .fechaNacimiento(cliente.getFechaNacimiento())
                    .build();
        }
        return null;
    }
}