package com.clase5nov.escuela.Servicios;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

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
        return (List<Alumno>) repositorioAlumno.findAll();
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

    @Transactional
    public boolean guardarImagen(MultipartFile foto){
        if(!foto.isEmpty()){
            String ruta = "C:/Users/javier.juarez/Documents/Imagenesdeprueba";
            try{
                byte[] bytes = foto.getBytes();
                Path rutaAbsoluta = Paths.get(ruta+"//"+foto.getOriginalFilename());
                Files.write(rutaAbsoluta,bytes);
                return true;
            }catch(Exception e){
                System.out.println(e);
            }
        }
        return false;
    }

}
