package com.portfolio.argprograma.service;

import com.portfolio.argprograma.model.Persona;
import com.portfolio.argprograma.repository.IPersonaRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PersonaService implements IPersonaService {
    
    @Autowired
    public IPersonaRepository iPersonaRepository;

    @Override
    public List<Persona> getPersona() {
        List<Persona> persona=iPersonaRepository.findAll();
        return persona;
    }

    @Override
    public Persona findPersona(int id) {
        Persona persona=iPersonaRepository.findById(id).orElse(null);
        return persona;        
    }
    
    @Override
    public Persona findByNombre(String nombre){
        Persona persona=iPersonaRepository.findByNombre(nombre);
        return persona;
    }
    
    @Override
    public Persona findByApellido(String apellido){
        Persona persona=iPersonaRepository.findByApellido(apellido);
        return persona;
    }
    
    @Override
    public void savePersona(Persona persona) {
        iPersonaRepository.save(persona);
       
    }
    
    @Override
    public void deletePersona(int id) {
        iPersonaRepository.deleteById(id);
        
    }
    @Override
    public boolean existsById(int id){
        return iPersonaRepository.existsById(id);
    }  
    @Override
    public boolean existsByNombre(String nombre){
       return iPersonaRepository.existsByNombre(nombre);
    }
    
    @Override
    public boolean existsByApellido(String apellido){
        return iPersonaRepository.existsByApellido(apellido);
    }
}
