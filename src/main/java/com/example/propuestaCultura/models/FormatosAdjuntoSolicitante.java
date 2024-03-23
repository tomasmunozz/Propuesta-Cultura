package com.example.propuestaCultura.models;

import jakarta.persistence.*;

@Entity
@Table(name = "formatos_adjunto_solicitante")
public class FormatosAdjuntoSolicitante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_adjunto_solicitante")

    private Integer id_adjunto_solicitante;
    @OneToOne
    @JoinColumn(name = "id_propuesta", referencedColumnName = "id_propuesta")
    private Propuesta propuesta;
    @Column(name = "nombre_formato_inhabilidades")
    private String nombre_formato_inhabilidades;
    @Column(name="extra_data")
    private  String extra_data;

    public Integer getId_adjunto_solicitante() {
        return id_adjunto_solicitante;
    }

    public void setId_adjunto_solicitante(Integer id_adjunto_solicitante) {
        this.id_adjunto_solicitante = id_adjunto_solicitante;
    }

    public Propuesta getPropuesta() {
        return propuesta;
    }

    public void setPropuesta(Propuesta propuesta) {
        this.propuesta = propuesta;
    }

    public String getNombre_formato_inhabilidades() {
        return nombre_formato_inhabilidades;
    }

    public void setNombre_formato_inhabilidades(String nombre_formato_inhabilidades) {
        this.nombre_formato_inhabilidades = nombre_formato_inhabilidades;
    }

    public String getExtra_data() {
        return extra_data;
    }

    public void setExtra_data(String extra_data) {
        this.extra_data = extra_data;
    }
}
