package com.portfolio.argprograma.service;

import com.portfolio.argprograma.model.Educacion;
import java.util.List;


public interface IEducacionService {
    public List<Educacion> getEducacion();
    
    public void saveEducacion(Educacion educacion);
    
    public void deleteEducacion(int id);
    
    public Educacion findEducacion(int id);
    
    public Educacion findByTitulo(String titulo);
    
    public boolean existsByTitulo(String titulo);
    
    public boolean existsById(int id);
}

