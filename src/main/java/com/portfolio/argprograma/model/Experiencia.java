package com.portfolio.argprograma.model;

import java.sql.Date;
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
@Table(name="experiencia")
 public class Experiencia {
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column
    @NotNull
    @Size(min=1,max=60, message="no cumple con la longitud")
    private String empresa;
    
    @Column
    @NotNull
    @Size(min=1,max=45, message="no cumple con la longitud")
    private String puesto;
    
    @Column
    private String fecha_inicio;
    @Column
    private String fecha_fin;
    @Column
    private String tareas;
    @Column
    private Long persona_id;     
    
}
