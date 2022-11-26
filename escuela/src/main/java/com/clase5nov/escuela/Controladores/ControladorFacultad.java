package com.clase5nov.escuela.Controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clase5nov.escuela.Modelos.Facultad;
import com.clase5nov.escuela.Servicios.ServicioFacultad;

@RestController
@RequestMapping("/facultad")
public class ControladorFacultad {
         
         @Autowired
         ServicioFacultad servicioFacultad;

         @PostMapping("/registrarFacultad")
         public Facultad registrarFacultad(@RequestBody Facultad facultad){
                  return servicioFacultad.registrarFacultad(facultad);
         }
}
