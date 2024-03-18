package com.demo.persistencia.demopersistencia.entidades;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "faturas")
public class Factura {

    //esto se conoce como primary key(PK)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fatura_id")
    private Long facturaId;

    @Column(name = "fecha_factura")
    private LocalDate fechaFactura;

    //FK
    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @Column(name = "total")
    private BigDecimal total;

    //conocida como relacion inversa
    @OneToMany(mappedBy = "factura") //mappedBy es una ralcion unidireccional y se puedde traducir como "mapeado por"
    private List<DetalleFactura> detalles;

    
}
