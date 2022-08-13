package com.portfolio.argprograma.service;

import com.portfolio.argprograma.model.Experiencia;
import java.util.List;

public interface IExperienciaService {
    
    public List<Experiencia> getExperiencia();
    
    public void saveExperiencia(Experiencia experiencia);
    
    public void deleteExperiencia(int id);
    
    public Experiencia findExperiencia(int id);
    
    public boolean existsByEmpresa(String Empresa);
    
    public boolean existsById(int id);
    
    public boolean existsByPuesto(String Puesto);
    
    public Experiencia getByEmpresa(String Empresa);
}
