package com.portfolio.argprograma.service;

import com.portfolio.argprograma.model.Habilidad;
import com.portfolio.argprograma.repository.IHabilidadRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HabilidadService implements IHabilidadService {
    @Autowired
    public IHabilidadRepository iHabilidadRepository;

    @Override
    public List<Habilidad> getHabilidad() {
        List<Habilidad> habilidad=iHabilidadRepository.findAll();
        return habilidad;
    }

    @Override
    public void saveHabilidad(Habilidad habilidad) {
        iHabilidadRepository.save(habilidad);
       
    }
    @Override
    public void deleteHabilidad(Long id) {
        iHabilidadRepository.deleteById(id);
        
    }

    @Override
    public Habilidad findHabilidad(Long id) {
        Habilidad habilidad=iHabilidadRepository.findById(id).orElse(null);
        return habilidad;        
    }
    
}
