package com.portfolio.argprograma.service;

import com.portfolio.argprograma.model.Educacion;
import java.util.List;
import java.util.Optional;


public interface IEducacionService {
    
    public List<Educacion> getEducacion();
    
    public void saveEducacion(Educacion educacion);
    
    public void deleteEducacion(int id);
    
    public Optional<Educacion> findEducacion(int id);
    
    public Optional<Educacion> findByTitulo(String titulo);
    
    public boolean existsByTitulo(String titulo);
    
    public boolean existsById(int id);
}

