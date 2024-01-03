package com.registro.usuarios.publicacionescomentarios.repositories;

import com.registro.usuarios.publicacionescomentarios.entities.Publicacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublicacionRepository extends JpaRepository<Publicacion, Long> {
}
