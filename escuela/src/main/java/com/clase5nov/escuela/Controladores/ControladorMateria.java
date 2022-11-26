package com.clase5nov.escuela.Controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clase5nov.escuela.Modelos.Materia;
import com.clase5nov.escuela.Servicios.ServicioMateria;

@RestController
@RequestMapping("/materia")
public class ControladorMateria {

         @Autowired
         ServicioMateria servicioMateria;

         @PostMapping("/registrarMateria")
         public Materia registrarMateria(@RequestBody Materia materia){
                  return servicioMateria.registrarMateria(materia);
         }
         
}
