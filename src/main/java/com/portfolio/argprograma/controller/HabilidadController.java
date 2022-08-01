package com.portfolio.argprograma.controller;

import com.portfolio.argprograma.model.Habilidad;
import com.portfolio.argprograma.service.IHabilidadService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HabilidadController {
    
    @Autowired
    public IHabilidadService iHabilidadService;
    
    @GetMapping("/habilidades/traer")
    public List<Habilidad> getHabilidad(){
        return iHabilidadService.getHabilidad();
    }
 
    @PostMapping("/habilidades/crear")
    public String createHabilidad(@RequestBody Habilidad habilidad){
        iHabilidadService.saveHabilidad(habilidad);
        return "La habilidad fue creada correctamente";
    }
    
    @DeleteMapping("/habilidades/borrar/{id}")
    public String deleteHabilidad(@PathVariable Long id){
        iHabilidadService.deleteHabilidad(id);
        return "La habilidad fue eliminada correctamente";
    }
    
    @PutMapping("/habilidades/editar/{id}")
    public Habilidad editHabilidad(@PathVariable Long id,
                                @RequestParam("nombre") String nuevoNombre,
                                @RequestParam("porcentaje")Long nuevoPorcentaje)
                                //@RequestParam("persona_id")String nuevoPersona_id)
                                {
                                        
        Habilidad habilidad=iHabilidadService.findHabilidad(id);
        
        habilidad.setNombre(nuevoNombre);
        habilidad.setPorcentaje(nuevoPorcentaje);
       //habilidad.setPersona_id(nuevoPersona_id);
        
        iHabilidadService.saveHabilidad(habilidad);
        return habilidad;
    }
}
