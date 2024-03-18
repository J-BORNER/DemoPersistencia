package com.demo.persistencia.demopersistencia.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.persistencia.demopersistencia.dto.FacturaDTO;
import com.demo.persistencia.demopersistencia.services.FacturaService;

@RestController
@RequestMapping("/api/facturas")
public class FacturaController {

    @Autowired
    private FacturaService facturaService;

    /**
     * @param clienteId
     * @return
     */
    @GetMapping("/cliente/{clienteId}")
    public List<FacturaDTO> getFacturasCliente(@PathVariable Long clienteId) {
        return facturaService.getFacturasCliente(clienteId);
    }

}
