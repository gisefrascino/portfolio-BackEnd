package com.portfolio.argprograma.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity     
public class Habilidad {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @NotNull
    @Size(min=1,max=60, message="no cumple con la longitud")
    private String nombre;
    
    @NotNull
    private Long porcentaje;
    
      
    //@Size (min=1, max=100, message="no cumple con la longitud")
    //private Long persona_id;
   
}

    
 