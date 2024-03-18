package com.demo.persistencia.demopersistencia.entidades;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "productos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Producto {


    @Id
    @Column(name = "producto_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productoId; //el "Long" es para las llaves promarias

    //atributos de la clase
    private String nombre;
    private BigDecimal precio; // para los decimales es recomendado usar "bigdecimal"
    private Integer stock; // para lo enteros recomendado usar "integer"
    
    

}
