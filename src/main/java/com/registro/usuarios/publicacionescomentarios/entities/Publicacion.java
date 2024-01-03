package com.registro.usuarios.publicacionescomentarios.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "publicaciones")
public class Publicacion extends AuditModel{
    private static final long serialVersionUID=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(max = 100)
    @Column(unique = true)
    private String titulo;

    @NotNull
    @Size(max = 250)
    private String descripcion;

    @NotNull
    @Lob
    private String contenido;
}
