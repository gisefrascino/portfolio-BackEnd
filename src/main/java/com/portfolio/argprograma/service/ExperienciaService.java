package com.portfolio.argprograma.service;

import com.portfolio.argprograma.model.Experiencia;
import com.portfolio.argprograma.repository.IExperienciaRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ExperienciaService implements IExperienciaService{
 @Autowired
    public IExperienciaRepository iExperienciaRepository;

    @Override
    public List<Experiencia> getExperiencia() {
        List<Experiencia> experiencia=iExperienciaRepository.findAll();
        return experiencia;
    }
    
    @Override
    public void saveExperiencia(Experiencia experiencia) {
        iExperienciaRepository.save(experiencia);
       
    }
    @Override
    public void deleteExperiencia(int id) {
        iExperienciaRepository.deleteById(id);
    }

    @Override
    public Experiencia findExperiencia(int id) {
        Experiencia experiencia=iExperienciaRepository.findById(id).orElse(null);
        return experiencia;        
    }
  
    @Override
    public Experiencia getByEmpresa(String Empresa){
        Experiencia experiencia=iExperienciaRepository.findByEmpresa(Empresa);
        return experiencia;
    }
    
    @Override
    public boolean existsById(int id){
        return iExperienciaRepository.existsById(id);
    }

    @Override
    public boolean existsByEmpresa(String Empresa){
        return iExperienciaRepository.existsByEmpresa(Empresa);
    }
    
    @Override
    public boolean existsByPuesto(String Puesto){
        return iExperienciaRepository.existsByPuesto(Puesto);
    }
    
    }
