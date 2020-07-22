package cl.lherrera.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cl.lherrera.model.dao.UsuarioDao;
import cl.lherrera.model.dto.UsuariosDto;

@Service
public class UsuarioService {
    
    @Autowired
    private UsuarioDao usuarioDao;
    
    @Transactional(readOnly = true)
    public UsuariosDto obtenerTodos() {
        return new UsuariosDto(200, usuarioDao.findAll());
    }
    
    @Transactional
    public UsuariosDto registrar() {
        return new UsuariosDto();
    }
    
    @Transactional
    public UsuariosDto actualizar() {
        return new UsuariosDto();
    }
    
    @Transactional
    public UsuariosDto eliminar() {
        return new UsuariosDto();
    }
    
    public UsuariosDto obtenerUsuario(Integer id) {
        return new UsuariosDto();
    }
    
}
