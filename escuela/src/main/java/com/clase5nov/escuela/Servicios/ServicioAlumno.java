package com.clase5nov.escuela.Servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.clase5nov.escuela.Modelos.Alumno;
import com.clase5nov.escuela.Repositorios.RepositorioAlumno;

@Service
public class ServicioAlumno {

    @Autowired
    RepositorioAlumno repositorioAlumno;

    @Transactional
    public Alumno registrarAlumno(Alumno alumno) {

        return repositorioAlumno.save(alumno);
    }

    public List<Alumno> obtenerAlumnos() {
        return repositorioAlumno.findAll();
    }

    public Optional<Alumno> obtenerAlumnoPorMatricula(String matricula) {

        return repositorioAlumno.findById(matricula);
    }

    public Alumno modificarAlumno(Alumno alumno) {
        Alumno alumno2 = new Alumno();

        if (repositorioAlumno.existsById(alumno.getMatricula())) {
            alumno2 = repositorioAlumno.save(alumno);
            return alumno2;
        } else {
            return alumno2;
        }
    }

    public boolean eliminarAlumno(String matricula) {
        if (repositorioAlumno.existsById(matricula)) {
            repositorioAlumno.deleteById(matricula);
            return true;
        } else {
            return false;
        }
    }

}
