package com.coderhouse.crudclientes.modelCompr;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@AllArgsConstructor
@Builder
@Data
@Entity
@Table(name = "COMPROBANTE")
@NoArgsConstructor
public class ComprobanteEntity {

    @Column(name = "COMPROBANTE_ID")
    @Id
    private long comprobante_Id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FECHA_COMPRA")
    private Date fecha_Compra;

    @Column(name = "CANTIDAD")
    private Integer cantidad;

    @Column(name = "TOTAL_COMPRA")
    private Integer total_Compra;
}