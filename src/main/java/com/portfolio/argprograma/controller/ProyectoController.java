package com.portfolio.argprograma.controller;

import com.portfolio.argprograma.model.Proyecto;
import com.portfolio.argprograma.service.IProyectoService;
import java.sql.Date;
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
public class ProyectoController {
   @Autowired
    public IProyectoService iProyectoService;
    
    @GetMapping("/proyectos/traer")
    public List<Proyecto> getProyecto(){
        return iProyectoService.getProyecto();
    }
 
    @PostMapping("/proyectos/crear")
    public String createProyecto(@RequestBody Proyecto proyecto){
        iProyectoService.saveProyecto(proyecto);
        return "El proyecto fue creado correctamente";
    }
    
    @DeleteMapping("/proyectos/borrar/{id}")
    public String deleteProyecto(@PathVariable Long id){
        iProyectoService.deleteProyecto(id);
        return "El proyecto fue eliminado correctamente";
    }
    
    @PutMapping("/proyectos/editar/{id}")
    public Proyecto editProyecto(@PathVariable Long id,
                                @RequestParam("nombre") String nuevoNombre,
                                @RequestParam("fecha_realizacion")Date nuevoFecha_realizacion, 
                                @RequestParam("descripcion")String nuevoDescripcion,
                                @RequestParam("link")String nuevoLink,
                                @RequestParam("img_proyecto")String nuevoImg_proyecto)
                                //@RequestParam("persona_id")String nuevoPersona_id)
                                {
                                        
        Proyecto proyecto=iProyectoService.findProyecto(id);
        
        proyecto.setNombre(nuevoNombre);
        proyecto.setFecha_realizacion(nuevoFecha_realizacion);
        proyecto.setDescripcion(nuevoDescripcion);
        proyecto.setLink(nuevoLink);
        proyecto.setImg_proyecto(nuevoImg_proyecto);
        //proyecto.setPersona_id(nuevoPersona_id);
        
        iProyectoService.saveProyecto(proyecto);
        return proyecto;
    }
}

