package com.coderhouse.crudclientes.modelCompr;

import lombok.*;
import java.util.Date;

@Data
@Builder
public class ComprobanteResponse {

    private long comprobante_Id;
    private Date fecha_Compra;
    private Integer cantidad;
    private Integer total_Compra;
}