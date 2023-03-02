package com.perlacode.apirest.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.perlacode.apirest.entidad.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    // Aquí puedes agregar métodos adicionales si es necesario

}
