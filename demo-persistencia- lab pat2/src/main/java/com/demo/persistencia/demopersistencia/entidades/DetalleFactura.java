package com.demo.persistencia.demopersistencia.entidades;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "detalle_factura")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DetalleFactura {

    @Id
    @Column(name = "detalle_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long detalleId;

    // lavves FK "foraane key"
    @ManyToOne
    @Column(name = "fatura_id")
    private Factura factura;

    // llave FK "foranie key"
    @ManyToOne// esto es lo que conocemos como muchos a uno
    @JoinColumn(name = "producto_id")
    private Producto producto;

    // atributos pertenecientes(propios) a la tabla.
    @Column(name = "cantidad")
    private int catidad;

    @Column(name = "precio_unitario")
    private BigDecimal precioUnitario;
}
