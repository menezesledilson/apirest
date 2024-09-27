package com.api.demo.Controller;

import com.api.demo.Entity.Usuario;
import com.api.demo.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping
    public ResponseEntity<Usuario> criarUsuario (@RequestBody Usuario usuario){
        Usuario novoUsuario = usuarioRepository.save(usuario);
        return ResponseEntity.status(201).body(usuario);
    }
    @GetMapping
    public ResponseEntity<List<Usuario>>listarUsuarios(){
        List<Usuario> usuarios = usuarioRepository.findAll();
        return ResponseEntity.ok(usuarios);
    }
}
