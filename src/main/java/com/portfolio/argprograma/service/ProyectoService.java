package com.portfolio.argprograma.service;

import com.portfolio.argprograma.model.Proyecto;
import com.portfolio.argprograma.repository.IProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService implements IProyectoService{
    @Autowired
    public IProyectoRepository iProyectoRepository;

    @Override
    public List<Proyecto> getProyecto() {
        List<Proyecto> proyecto=iProyectoRepository.findAll();
        return proyecto;
    }

    @Override
    public void saveProyecto(Proyecto proyecto) {
        iProyectoRepository.save(proyecto);
       
    }
    @Override
    public void deleteProyecto(Long id) {
        iProyectoRepository.deleteById(id);
        
    }

    @Override
    public Proyecto findProyecto(Long id) {
        Proyecto proyecto=iProyectoRepository.findById(id).orElse(null);
        return proyecto;        
    }
    
}

