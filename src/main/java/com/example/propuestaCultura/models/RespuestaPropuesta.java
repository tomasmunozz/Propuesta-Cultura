package com.example.propuestaCultura.models;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name = "respuesta_propuesta")
public class RespuestaPropuesta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_respuesta_propuesta")
    private Integer id_respuesta_propuesta;
    @OneToOne
    @JoinColumn(name = "id_propuesta",referencedColumnName = "id_propuesta")
    private Propuesta propuesta;
    @Column(name = "fecha_recepcion")
    private LocalDate fecha_recepcion;
    @Column(name = "consulta_listas_publicas")
    private Boolean consulta_listas_publicas;
    @Column(name = "area_receptora")
    private String area_receptora;
    @Column(name = "nogocio")
    private String negocio; //enum
    @Column(name = "observaciones")
    private String observaciones;
    @Column(name = "se_apoya")
    private Boolean se_apoya;
    @Column(name = "descripcion_apoyo")
    private String descripcion_apoyo;
    @Column(name = "respuesta")
    private String respuesta;
    @Column(name = "encargado_respuesta")
    private String encargado_respuesta;
    @Column(name = "medio_notificacion")
    private String medio_notificacion;

    public Integer getId_respuesta_propuesta() {
        return id_respuesta_propuesta;
    }

    public void setId_respuesta_propuesta(Integer id_respuesta_propuesta) {
        this.id_respuesta_propuesta = id_respuesta_propuesta;
    }

    public Propuesta getPropuesta() {
        return propuesta;
    }

    public void setPropuesta(Propuesta propuesta) {
        this.propuesta = propuesta;
    }

    public LocalDate getFecha_recepcion() {
        return fecha_recepcion;
    }

    public void setFecha_recepcion(LocalDate fecha_recepcion) {
        this.fecha_recepcion = fecha_recepcion;
    }

    public Boolean getConsulta_listas_publicas() {
        return consulta_listas_publicas;
    }

    public void setConsulta_listas_publicas(Boolean consulta_listas_publicas) {
        this.consulta_listas_publicas = consulta_listas_publicas;
    }

    public String getArea_receptora() {
        return area_receptora;
    }

    public void setArea_receptora(String area_receptora) {
        this.area_receptora = area_receptora;
    }

    public String getNegocio() {
        return negocio;
    }

    public void setNegocio(String negocio) {
        this.negocio = negocio;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Boolean getSe_apoya() {
        return se_apoya;
    }

    public void setSe_apoya(Boolean se_apoya) {
        this.se_apoya = se_apoya;
    }

    public String getDescripcion_apoyo() {
        return descripcion_apoyo;
    }

    public void setDescripcion_apoyo(String descripcion_apoyo) {
        this.descripcion_apoyo = descripcion_apoyo;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public String getEncargado_respuesta() {
        return encargado_respuesta;
    }

    public void setEncargado_respuesta(String encargado_respuesta) {
        this.encargado_respuesta = encargado_respuesta;
    }

    public String getMedio_notificacion() {
        return medio_notificacion;
    }

    public void setMedio_notificacion(String medio_notificacion) {
        this.medio_notificacion = medio_notificacion;
    }
}
