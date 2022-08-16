package com.portfolio.argprograma.service;

import com.portfolio.argprograma.model.Educacion;
import com.portfolio.argprograma.repository.IEducacionRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class EducacionService implements IEducacionService {
    @Autowired
    public IEducacionRepository iEducacionRepository;

    @Override
    public List<Educacion> getEducacion() {
        List<Educacion> educacion=iEducacionRepository.findAll();
        return educacion;
    }
    
    @Override
    public Educacion findEducacion(int id) {
        Educacion educacion=iEducacionRepository.findById(id).orElse(null);
        return educacion;        
    }

    @Override
    public Educacion findByTitulo(String titulo){
        Educacion educacion=iEducacionRepository.findByTitulo(titulo);
        return educacion;
    }
    
    @Override
    public void saveEducacion(Educacion educacion) {
        iEducacionRepository.save(educacion);
       
    }
    @Override
    public void deleteEducacion(int id) {
        iEducacionRepository.deleteById(id);
    }
   
    @Override
    public boolean existsById(int id){
        return iEducacionRepository.existsById(id);
       
    }
    @Override
    public boolean existsByTitulo(String titulo){
       return iEducacionRepository.existsByTitulo(titulo);
    }
    }

