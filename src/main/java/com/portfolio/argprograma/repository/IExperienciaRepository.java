package com.portfolio.argprograma.repository;

import com.portfolio.argprograma.model.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IExperienciaRepository extends JpaRepository<Experiencia, Integer>{
    
    public Experiencia findByEmpresa(String empresa);
   
    public boolean existsByEmpresa(String empresa);
    
    public boolean existsByPuesto(String puesto);
    
}