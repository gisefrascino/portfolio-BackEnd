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
@Table(name="educacion")
public class Educacion { 
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column
    @NotNull
    @Size(min=1,max=50, message="no cumple con la longitud")
    private String titulo;
    
    @Column
    private String fecha_inicio;
    @Column
    private String fecha_fin;
    @Column
    private int persona_id;   
    @Column
    private int institucion_id;

    public Educacion() {
    }

    public Educacion(String titulo, String fecha_inicio, String fecha_fin, int persona_id, int institucion_id) {
        this.titulo = titulo;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.persona_id = persona_id;
        this.institucion_id = institucion_id;
    }
}
