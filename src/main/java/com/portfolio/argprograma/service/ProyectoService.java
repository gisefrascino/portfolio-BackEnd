package com.portfolio.argprograma.service;

import com.portfolio.argprograma.model.Proyecto;
import com.portfolio.argprograma.repository.IProyectoRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProyectoService implements IProyectoService{
    @Autowired
    public IProyectoRepository iProyectoRepository;

    @Override
    public List<Proyecto> getProyecto() {
        List<Proyecto> proyecto=iProyectoRepository.findAll();
        return proyecto;
    }
    
    @Override
    public Proyecto findProyecto(int id) {
        Proyecto proyecto=iProyectoRepository.findById(id).orElse(null);
        return proyecto;        
    }
    
    @Override
    public void saveProyecto(Proyecto proyecto) {
        iProyectoRepository.save(proyecto);
       
    }
    @Override
    public void deleteProyecto(int id) {
        iProyectoRepository.deleteById(id);
        
    }

    @Override
     public boolean existsById(int id){
        return iProyectoRepository.existsById(id);   
    }
    
}

