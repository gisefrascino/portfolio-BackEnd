package com.portfolio.argprograma.service;

import com.portfolio.argprograma.model.Experiencia;
import java.util.List;

public interface IExperienciaService {
    
    public List<Experiencia> getExperiencia();
    
    public void saveExperiencia(Experiencia experiencia);
    
    public void deleteExperiencia(Long id);
    
    public Experiencia findExperiencia(Long id);
    
}
