package com.coderhouse.crudclientes.builder;

import com.coderhouse.crudclientes.modelCompr.ComprobanteEntity;
import com.coderhouse.crudclientes.modelCompr.ComprobanteRequest;
import com.coderhouse.crudclientes.modelCompr.ComprobanteResponse;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ComprobanteBuilder {

    public static ComprobanteResponse entityComprobanteToResponse(ComprobanteEntity comprobante) {
        if (Objects.nonNull(comprobante)) {
            return ComprobanteResponse.builder()
                    .comprobante_Id(comprobante.getComprobante_Id())
                    .fecha_Compra(comprobante.getFecha_Compra())
                    .cantidad(comprobante.getCantidad())
                    .total_Compra(comprobante.getTotal_Compra())
                    .build();
        }
        return null;
    }

    public static List<ComprobanteResponse> entityComprobanteToResponseList(List<ComprobanteEntity> entityComprobanteList) {
        return entityComprobanteList.stream().map(ComprobanteBuilder::entityComprobanteToResponse).collect(Collectors.toList());
    }

    public static ComprobanteEntity requestComprobanteToEntity(ComprobanteRequest comprobante) {
        if (Objects.nonNull(comprobante)) {
            return ComprobanteEntity.builder()
                    .comprobante_Id(comprobante.getComprobante_Id())
                    .fecha_Compra(comprobante.getFecha_Compra())
                    .cantidad(comprobante.getCantidad())
                    .total_Compra(comprobante.getTotal_Compra())
                    .build();
        }
        return null;
    }
}