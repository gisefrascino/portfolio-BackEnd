package com.portfolio.argprograma.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity     
@Table(name="habilidad")
public class Habilidad {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column
    @NotNull
    @Size(min=1,max=60, message="no cumple con la longitud")
    private String nombre;
    
    @Column
    @NotNull
    private Long porcentaje;
    @Column
    private Long persona_id;
   
}

    
 