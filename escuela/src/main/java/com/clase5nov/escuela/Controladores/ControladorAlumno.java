package com.clase5nov.escuela.Controladores;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clase5nov.escuela.Modelos.Alumno;
import com.clase5nov.escuela.Servicios.ServicioAlumno;

@RestController
@RequestMapping("/alumno")
public class ControladorAlumno {

    @Autowired
    ServicioAlumno servicioAlumno;

    @PostMapping("/registrarAlumno")
    public Alumno registrarAlumno(@RequestBody Alumno alumno) {
        return servicioAlumno.registrarAlumno(alumno);
    }

    @GetMapping("/obtenerAlumnos")
    public List<Alumno> obtenerAlumnos() {
        return servicioAlumno.obtenerAlumnos();
    }

    @GetMapping("/obtenerAlumnoPorMatricula/{matricula}")
    public Optional<Alumno> obtenerAlumnoPorMatricula(@PathVariable String matricula) {
        return servicioAlumno.obtenerAlumnoPorMatricula(matricula);
    }

    @PutMapping("/modificarAlumno")
    public Alumno modificarAlumno(@RequestBody Alumno alumno) {
        return servicioAlumno.modificarAlumno(alumno);
    }

    @DeleteMapping("/eliminarAlumno/{matricula}")
    public boolean eliminarAlumno(@PathVariable String matricula) {
        return servicioAlumno.eliminarAlumno(matricula);
    }
}
