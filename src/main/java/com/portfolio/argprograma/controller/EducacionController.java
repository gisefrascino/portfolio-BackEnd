package com.portfolio.argprograma.controller;

import com.portfolio.argprograma.model.Educacion;
import com.portfolio.argprograma.service.IEducacionService;
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
public class EducacionController {
 @Autowired
    public IEducacionService iEducacionService;
    
    @GetMapping("/educaciones/traer")
    public List<Educacion> getEducacion(){
        return iEducacionService.getEducacion();
    }
 
    @PostMapping("/educaciones/crear")
    public String createEducacion(@RequestBody Educacion educacion){
        iEducacionService.saveEducacion(educacion);
        return "La educacion fue creada correctamente";
    }
    
    @DeleteMapping("/educaciones/borrar/{id}")
    public String deleteEducacion(@PathVariable Long id){
        iEducacionService.deleteEducacion(id);
        return "La educacion fue eliminada correctamente";
    }
    
    @PutMapping("/educaciones/editar/{id}")
    public Educacion editEducacion(@PathVariable Long id,
                                @RequestParam("titulo") String nuevoTitulo,
                                @RequestParam("fecha_inicio")String nuevoFecha_inicio,
                                @RequestParam("fecha_fin")String nuevoFecha_fin,
                                @RequestParam("persona_id")int nuevoPersona_id,
                                @RequestParam("institucion_id") int nuevoInstitucion_id)
                                {
                                        
        Educacion educacion=iEducacionService.findEducacion(id);
        
        educacion.setTitulo(nuevoTitulo);
        educacion.setFecha_inicio(nuevoFecha_inicio);
        educacion.setFecha_fin(nuevoFecha_fin);
        educacion.setPersona_id(nuevoPersona_id);
        educacion.setInstitucion_id(nuevoInstitucion_id);
        
        iEducacionService.saveEducacion(educacion);
        return educacion;
    }
       
}
