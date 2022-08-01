package com.portfolio.argprograma.service;

import com.portfolio.argprograma.model.Habilidad;
import java.util.List;


public interface IHabilidadService {
    public List<Habilidad> getHabilidad();
    
    public void saveHabilidad(Habilidad habilidad);
    
    public void deleteHabilidad(Long id);
    
    public Habilidad findHabilidad(Long id);
    
}
