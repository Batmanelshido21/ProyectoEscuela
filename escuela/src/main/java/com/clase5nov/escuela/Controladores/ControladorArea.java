package com.clase5nov.escuela.Controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clase5nov.escuela.Modelos.Area;
import com.clase5nov.escuela.Servicios.ServicioArea;

@RestController
@RequestMapping("/area")
public class ControladorArea {

         @Autowired
         ServicioArea servicioArea;

         @PostMapping("/registrarArea")
         public Area registrarArea(@RequestBody Area area){
                  return servicioArea.registrarArea(area);
         }
         
}
