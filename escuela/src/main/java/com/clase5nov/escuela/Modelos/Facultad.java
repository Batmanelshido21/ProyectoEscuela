package com.clase5nov.escuela.Modelos;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name="Facultad")
public class Facultad {
         
         @Id
         @Column(name="nombre", unique = true, nullable = false)
         private String nombre;

         @JsonManagedReference
         @OneToMany(mappedBy = "facultad")
         private Set<Alumno> alumno;

         @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
         @JoinColumn(name="Area_nombre", referencedColumnName = "nombre")
         private Area area;

}
