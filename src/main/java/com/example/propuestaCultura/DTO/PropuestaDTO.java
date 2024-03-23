package com.example.propuestaCultura.DTO;

import jakarta.persistence.Column;

import java.time.LocalDate;

public class PropuestaDTO {

    private String nombre_proponente;
    private String estado;
    private Integer municipio;
    private String presentacion_general;
    private LocalDate fecha_presentacion_propuesta;
    private String descripcion_actividades;
    private String publico_beneficiado;
    private String entidades_aliadas;
    private String contraprestaciones;
    private Double monto_total;
    private String aporte_comfama_especie;
    private Double porcentaje_aporte_comfama;
    private String trayectoria;

    public PropuestaDTO() {
    }

    public PropuestaDTO(String nombre_proponente, String estado, Integer municipio, String presentacion_general, LocalDate fecha_presentacion_propuesta, String descripcion_actividades, String publico_beneficiado, String entidades_aliadas, String contraprestaciones, Double monto_total, String aporte_comfama_especie, Double porcentaje_aporte_comfama, String trayectoria) {
        this.nombre_proponente = nombre_proponente;
        this.estado = estado;
        this.municipio = municipio;
        this.presentacion_general = presentacion_general;
        this.fecha_presentacion_propuesta = fecha_presentacion_propuesta;
        this.descripcion_actividades = descripcion_actividades;
        this.publico_beneficiado = publico_beneficiado;
        this.entidades_aliadas = entidades_aliadas;
        this.contraprestaciones = contraprestaciones;
        this.monto_total = monto_total;
        this.aporte_comfama_especie = aporte_comfama_especie;
        this.porcentaje_aporte_comfama = porcentaje_aporte_comfama;
        this.trayectoria = trayectoria;
    }

    public String getNombre_proponente() {
        return nombre_proponente;
    }

    public void setNombre_proponente(String nombre_proponente) {
        this.nombre_proponente = nombre_proponente;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Integer municipio) {
        this.municipio = municipio;
    }

    public String getPresentacion_general() {
        return presentacion_general;
    }

    public void setPresentacion_general(String presentacion_general) {
        this.presentacion_general = presentacion_general;
    }

    public LocalDate getFecha_presentacion_propuesta() {
        return fecha_presentacion_propuesta;
    }

    public void setFecha_presentacion_propuesta(LocalDate fecha_presentacion_propuesta) {
        this.fecha_presentacion_propuesta = fecha_presentacion_propuesta;
    }

    public String getDescripcion_actividades() {
        return descripcion_actividades;
    }

    public void setDescripcion_actividades(String descripcion_actividades) {
        this.descripcion_actividades = descripcion_actividades;
    }

    public String getPublico_beneficiado() {
        return publico_beneficiado;
    }

    public void setPublico_beneficiado(String publico_beneficiado) {
        this.publico_beneficiado = publico_beneficiado;
    }

    public String getEntidades_aliadas() {
        return entidades_aliadas;
    }

    public void setEntidades_aliadas(String entidades_aliadas) {
        this.entidades_aliadas = entidades_aliadas;
    }

    public String getContraprestaciones() {
        return contraprestaciones;
    }

    public void setContraprestaciones(String contraprestaciones) {
        this.contraprestaciones = contraprestaciones;
    }

    public Double getMonto_total() {
        return monto_total;
    }

    public void setMonto_total(Double monto_total) {
        this.monto_total = monto_total;
    }

    public String getAporte_comfama_especie() {
        return aporte_comfama_especie;
    }

    public void setAporte_comfama_especie(String aporte_comfama_especie) {
        this.aporte_comfama_especie = aporte_comfama_especie;
    }

    public Double getPorcentaje_aporte_comfama() {
        return porcentaje_aporte_comfama;
    }

    public void setPorcentaje_aporte_comfama(Double porcentaje_aporte_comfama) {
        this.porcentaje_aporte_comfama = porcentaje_aporte_comfama;
    }

    public String getTrayectoria() {
        return trayectoria;
    }

    public void setTrayectoria(String trayectoria) {
        this.trayectoria = trayectoria;
    }
}
