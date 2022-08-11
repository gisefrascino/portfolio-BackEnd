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
@Table(name="proyecto")
public class Proyecto {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column
    @NotNull
    @Size(min=1,max=60, message="no cumple con la longitud")
    private String nombre;
    
    @Column
    private String fecha_realizacion;
    @Column
    private String descripcion;
    @Column
    private String link;
    @Column
    private String img_proyecto;  
    @Column
    private Long persona_id;
    
}

