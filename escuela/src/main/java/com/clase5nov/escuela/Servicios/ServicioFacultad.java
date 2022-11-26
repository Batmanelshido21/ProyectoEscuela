package com.clase5nov.escuela.Servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clase5nov.escuela.Modelos.Facultad;
import com.clase5nov.escuela.Repositorios.RepositorioFacultad;

@Service
public class ServicioFacultad {
         
         @Autowired
         RepositorioFacultad repositorioFacultad;

         public Facultad registrarFacultad(Facultad facultad){
                  return repositorioFacultad.save(facultad);
         }

}
