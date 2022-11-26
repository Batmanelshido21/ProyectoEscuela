package com.clase5nov.escuela.Modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="Area")
public class Area {
         
         @Id
         @Column(name="nombre", unique = true, nullable = false)
         private String nombre;

         @Column(name="descripcion", unique = true, nullable = false)
         private String descripcion;

         @OneToOne(mappedBy = "area")
         private Facultad facultad;
}
