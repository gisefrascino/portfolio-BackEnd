package com.portfolio.argprograma.repository;

import com.portfolio.argprograma.model.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEducacionRepository extends JpaRepository<Educacion, Integer>{
    
    public Educacion findByTitulo(String titulo);
    
    public boolean existsByTitulo(String titulo);
}
