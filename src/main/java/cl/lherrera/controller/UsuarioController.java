package cl.lherrera.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.lherrera.model.dto.UsuariosDto;
import cl.lherrera.service.UsuarioService;

@RestController
@RequestMapping("/api/v1/usuarios")
public class UsuarioController {
    
    @Autowired
    private UsuarioService servicio;
    
    @GetMapping
    public UsuariosDto usuarios() {
        return servicio.obtenerTodos();
        
    }

}
