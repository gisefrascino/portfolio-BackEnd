
package com.portfolio.argprograma.controller;

import com.portfolio.argprograma.model.Experiencia;
import com.portfolio.argprograma.service.IExperienciaService;
import java.sql.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ExperienciaController {
    
    @Autowired
    public IExperienciaService iExperienciaService;
    
    @GetMapping("/experiencias/traer")
    public List<Experiencia> getExperiencia(){
        return iExperienciaService.getExperiencia();
    }
 
    @PostMapping("/experiencias/crear")
    public String createExperiencia(@RequestBody Experiencia experiencia){
        iExperienciaService.saveExperiencia(experiencia);
        return "La experiencia fue creada correctamente";
    }
    
    @DeleteMapping("/experiencias/borrar/{id}")
    public String deleteExperiencia(@PathVariable Long id){
        iExperienciaService.deleteExperiencia(id);
        return "La experiencia fue eliminada correctamente";
    }
    
    @PutMapping("/experiencias/editar/{id}")
    public Experiencia editExperiencia(@PathVariable Long id,
                                @RequestParam("empresa") String nuevoEmpresa,
                                @RequestParam("puesto")String nuevoPuesto, 
                                @RequestParam("fecha_inicio")String nuevoFecha_inicio,
                                @RequestParam("fecha_fin")String nuevoFecha_fin,
                                @RequestParam("tareas")String nuevoTareas,
                                @RequestParam("persona_id")Long nuevoPersona_id)
                                {
                                        
        Experiencia experiencia=iExperienciaService.findExperiencia(id);
        
        experiencia.setEmpresa(nuevoEmpresa);
        experiencia.setPuesto(nuevoPuesto);
        experiencia.setFecha_inicio(nuevoFecha_inicio);
        experiencia.setFecha_fin(nuevoFecha_fin);
        experiencia.setTareas(nuevoTareas);
        experiencia.setPersona_id(id);
        
        iExperienciaService.saveExperiencia(experiencia);
        return experiencia;
    }
    
    
    
}
