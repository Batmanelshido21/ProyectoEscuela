package com.clase5nov.escuela.Modelos;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "Alumno")
public class Alumno {

    @Id
    @Column(name = "matricula", nullable = false, unique = true)
    private String matricula;
  
    @Column(name = "nombre", nullable = false)
    private String nombre;

    @ManyToMany(cascade = {CascadeType.MERGE,CascadeType.PERSIST},fetch = FetchType.EAGER)
    @JoinTable(name="Alumno_has_Materia",joinColumns = @JoinColumn(name="Alumno_matricula"),
    inverseJoinColumns = @JoinColumn(name="Materia_nombre"))
    Set<Materia>materia;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="Facultad_nombre",referencedColumnName = "nombre", nullable = true)
    private Facultad facultad;

}
