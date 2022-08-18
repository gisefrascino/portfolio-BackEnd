package com.portfolio.argprograma.service;

import com.portfolio.argprograma.model.Proyecto;
import java.util.List;


public interface IProyectoService {
    
    public List<Proyecto> getProyecto();
    
    public void saveProyecto(Proyecto proyecto);
    
    public void deleteProyecto(int id);
    
    public Proyecto findProyecto(int id);
    
    public boolean existsById(int id);
}
