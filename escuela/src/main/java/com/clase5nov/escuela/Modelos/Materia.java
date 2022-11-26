package com.clase5nov.escuela.Modelos;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="Materia")
public class Materia {
       
         @Id
         @Column(name="nombre", unique = true, nullable = false)
         private String nombre;

         @ManyToMany(mappedBy = "materia")
         Set<Alumno> alumno;


}
