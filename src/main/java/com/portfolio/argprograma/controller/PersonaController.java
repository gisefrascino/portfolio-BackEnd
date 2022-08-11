package com.portfolio.argprograma.controller;

import com.portfolio.argprograma.model.Persona;
import com.portfolio.argprograma.service.IPersonaService;
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
public class PersonaController {
    
    @Autowired
    public IPersonaService iPersonaService;
    
    @GetMapping("/personas/traer")
    public List<Persona> getPersona(){
        return iPersonaService.getPersona();
    }
 
    @PostMapping("/personas/crear")
    public String createPersona(@RequestBody Persona persona){
        iPersonaService.savePersona(persona);
        return "La persona fue creada correctamente";
    }
    
    @DeleteMapping("/personas/borrar/{id}")
    public String deletePersona(@PathVariable Long id){
        iPersonaService.deletePersona(id);
        return "La persona fue eliminada correctamente";
    }
    
    @PutMapping("/personas/editar/{id}")
    public Persona editPersona(@PathVariable Long id,
                                @RequestParam("nombre") String nuevoNombre,
                                @RequestParam("apellido")String nuevoApellido, 
                                @RequestParam("img_fondo")String nuevoImg_fondo,
                                @RequestParam("img_perfil")String nuevoImg_perfil,
                                @RequestParam("titulo")String nuevoTitulo,
                                @RequestParam("info_profesional")String nuevoInfo_profesional,
                                @RequestParam("nacionalidad") String nuevoNacionalidad,
                                @RequestParam("localidad_id")Long nuevoLocalidad_id)
                                {
                                        
        Persona persona=iPersonaService.findPersona(id);
        
        persona.setNombre(nuevoNombre);
        persona.setApellido(nuevoApellido);
        persona.setImg_fondo(nuevoImg_fondo);
        persona.setImg_perfil(nuevoImg_perfil);
        persona.setTitulo(nuevoTitulo);
        persona.setInfo_profesional(nuevoInfo_profesional);
        persona.setNacionalidad(nuevoNacionalidad);
        persona.setLocalidad_id(id);
        
        iPersonaService.savePersona(persona);
        return persona;
    }
}
