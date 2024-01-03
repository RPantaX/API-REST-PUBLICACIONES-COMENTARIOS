package com.registro.usuarios.publicacionescomentarios.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "comentarios")
public class Comentario extends AuditModel{
    private static final long serialVersionUID=1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Lob //tiene datos largos
    private String texto;

    @ManyToOne(fetch =FetchType.LAZY, optional = false)
    @JoinColumn(name = "publicacion_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE) //decide eliminar una entrada de una base de datos, cuando hay una subclase, si eliminamos esta publicación, tambien se eliminarán sus comentarios
    @JsonIgnore
    private Publicacion publicacion;

}
