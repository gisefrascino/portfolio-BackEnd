package com.portfolio.argprograma.repository;

import com.portfolio.argprograma.model.Habilidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHabilidadRepository extends JpaRepository<Habilidad, Integer> {
    
}
