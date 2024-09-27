package com.api.demo.repository;

import com.api.demo.Entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario,  Long> {
}
