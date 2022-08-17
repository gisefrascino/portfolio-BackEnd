package com.portfolio.argprograma.service;

import com.portfolio.argprograma.model.Persona;
import java.util.List;


public interface IPersonaService {
    
    public List<Persona> getPersona();
    
    public void savePersona(Persona persona);
    
    public void deletePersona(int id);
    
    public Persona findPersona(int id);
    
    public Persona findByNombre(String nombre);
    
    public boolean existsByNombre(String nombre);
    
    public Persona findByApellido(String apellido);
    
    public boolean existsByApellido(String apellido);
    
    public boolean existsById(int id);
    }
    
  
