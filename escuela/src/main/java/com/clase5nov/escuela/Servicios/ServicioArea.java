package com.clase5nov.escuela.Servicios;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clase5nov.escuela.Modelos.Area;
import com.clase5nov.escuela.Repositorios.RepositorioArea;

@Service
public class ServicioArea {

         @Autowired
         RepositorioArea repositorioArea;

         @Transactional
         public Area registrarArea(Area area){
             return repositorioArea.save(area);
         }
         
}
