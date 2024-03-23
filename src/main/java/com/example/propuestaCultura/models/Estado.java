package com.example.propuestaCultura.models;

import com.example.propuestaCultura.helpers.EstadosPropuesta;
import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.web.WebProperties;
import org.yaml.snakeyaml.events.Event;

@Entity
@Table(name = "estado")
public class Estado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_estado")
    private Integer id_estado;

    @Column(name="estado")
    @Enumerated(EnumType.STRING)
    private EstadosPropuesta estado =EstadosPropuesta.INICIO;

    public Integer getId_estado() {
        return id_estado;
    }

    public void setId_estado(Integer id_estado) {
        this.id_estado = id_estado;
    }

    public EstadosPropuesta getEstado() {
        return estado;
    }

    public void setEstado(EstadosPropuesta estado) {
        this.estado = estado;
    }
}
