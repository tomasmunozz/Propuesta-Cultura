package com.example.propuestaCultura.DTO;

import jakarta.persistence.Column;

import java.time.LocalDate;

public class RespuestaPropuestaDTO {

    private String nombre_propuesta;
    private LocalDate fecha_recepcion;
    private Boolean consulta_listas_publicas;
    private String area_receptora;
    private String negocio; //enum
    private String observaciones;
    private Boolean se_apoya;
    private String descripcion_apoyo;
    private String respuesta;
    private String encargado_respuesta;
    private String medio_notificacion;

    public RespuestaPropuestaDTO() {
    }

    public RespuestaPropuestaDTO(String nombre_propuesta, LocalDate fecha_recepcion, Boolean consulta_listas_publicas, String area_receptora, String negocio, String observaciones, Boolean se_apoya, String descripcion_apoyo, String respuesta, String encargado_respuesta, String medio_notificacion) {
        this.nombre_propuesta = nombre_propuesta;
        this.fecha_recepcion = fecha_recepcion;
        this.consulta_listas_publicas = consulta_listas_publicas;
        this.area_receptora = area_receptora;
        this.negocio = negocio;
        this.observaciones = observaciones;
        this.se_apoya = se_apoya;
        this.descripcion_apoyo = descripcion_apoyo;
        this.respuesta = respuesta;
        this.encargado_respuesta = encargado_respuesta;
        this.medio_notificacion = medio_notificacion;
    }

    public String getNombre_propuesta() {
        return nombre_propuesta;
    }

    public void setNombre_propuesta(String nombre_propuesta) {
        this.nombre_propuesta = nombre_propuesta;
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
