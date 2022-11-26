package com.clase5nov.escuela.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.clase5nov.escuela.Modelos.Materia;

@Repository
public interface RepositorioMateria extends JpaRepository<Materia, String>{
         
}
