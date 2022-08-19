package com.portfolio.argprograma.service;

import com.portfolio.argprograma.model.Habilidad;
import java.util.List;
import java.util.Optional;


public interface IHabilidadService {
    public List<Habilidad> getHabilidad();
    
    public void saveHabilidad(Habilidad habilidad);
    
    public void deleteHabilidad(int id);
    
    public Optional<Habilidad> findHabilidad(int id);
    
    public boolean existsById(int id);
}
