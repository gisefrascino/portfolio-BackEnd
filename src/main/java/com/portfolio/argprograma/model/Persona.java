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
@Table(name="persona")
public class Persona {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column
    @NotNull
    @Size(min=1,max=45, message="no cumple con la longitud")
    private String nombre;
    
    @Column
    @NotNull
    @Size(min=1,max=45, message="no cumple con la longitud")
    private String apellido;
    
    @Column
    private String img_fondo;
    @Column
    private String img_perfil;
    @Column
    private String titulo;
    @Column
    private String info_profesional;
    @Column    
    private String nacionalidad;
    @Column
    private Long localidad_id;
    
}
