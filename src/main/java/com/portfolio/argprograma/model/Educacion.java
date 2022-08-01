package com.portfolio.argprograma.model;
    
import java.sql.Date;
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
public class Educacion { 
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @NotNull
    @Size(min=1,max=50, message="no cumple con la longitud")
    private String titulo;
    
    private Date fecha_inicio;
    private Date fecha_fin;
   // private Long persona_id;   
   // private Long institucion_id;
 
}
