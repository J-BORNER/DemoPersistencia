package com.demo.persistencia.demopersistencia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.persistencia.demopersistencia.entidades.Empleados;
import com.demo.persistencia.demopersistencia.repositorio.EmpleadoRepositorio;

@Service
public class EmpleadoServicio {

    @Autowired
    private EmpleadoRepositorio empleadoRepositorio;

    /**
     * consultar el empleado.
     * @return
     */
    public List<Empleados> consultarEmpleados(){
        return (List<Empleados>) empleadoRepositorio.findAll();
    }


    /**
     * @param 
     * @return el registro del empleado.
     */
    @SuppressWarnings("null")
    public Empleados registEmpleados(Empleados empleado){
        return empleadoRepositorio.save(empleado);
    }


}
