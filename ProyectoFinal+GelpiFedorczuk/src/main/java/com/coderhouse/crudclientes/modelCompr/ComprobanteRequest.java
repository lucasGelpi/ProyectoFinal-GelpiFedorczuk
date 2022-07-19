package com.coderhouse.crudclientes.modelCompr;

import lombok.Data;
import org.springframework.validation.annotation.Validated;
import java.util.Date;

@Data
@Validated
public class ComprobanteRequest {

    private long comprobante_Id;
    private Date fecha_Compra;
    private Integer cantidad;
    private Integer total_Compra;
}