package com.clase5nov.escuela.Servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clase5nov.escuela.Modelos.Materia;
import com.clase5nov.escuela.Repositorios.RepositorioMateria;

@Service
public class ServicioMateria {
        
         @Autowired
         RepositorioMateria repositorioMateria;

         public Materia registrarMateria(Materia materia){

                  return repositorioMateria.save(materia);
         }
}
