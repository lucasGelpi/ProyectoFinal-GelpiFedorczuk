package com.coderhouse.crudclientes.controller;

import com.coderhouse.crudclientes.modelCompr.ComprobanteResponse;
import com.coderhouse.crudclientes.service.ComprobanteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/comprobantes")
public class ComprobanteController {

    private final ComprobanteService comprobanteService;

    @GetMapping()
    public ResponseEntity<List<ComprobanteResponse>> obtenerComprobantes() {
        return ResponseEntity.ok(comprobanteService.buscarComprobantesTodos());
    }

    @GetMapping("/{comprobante_Id}")
    public ResponseEntity<ComprobanteResponse> buscarComprobante(@PathVariable Long comprobante_Id) {
        return ResponseEntity.ok(comprobanteService.buscarComprobante((comprobante_Id)));
    }
}