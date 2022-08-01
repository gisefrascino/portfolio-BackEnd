package com.portfolio.argprograma.repository;

import com.portfolio.argprograma.model.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProyectoRepository extends JpaRepository<Proyecto,Long> {
    
}
