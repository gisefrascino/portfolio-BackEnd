package com.portfolio.argprograma.repository;

import com.portfolio.argprograma.model.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IExperienciaRepository extends JpaRepository<Experiencia, Integer>{
    
    public Experiencia findByEmpresa(String Empresa);
   
    public boolean existsByEmpresa(String Empresa);
    
    public boolean existsByPuesto(String Puesto);
    
}