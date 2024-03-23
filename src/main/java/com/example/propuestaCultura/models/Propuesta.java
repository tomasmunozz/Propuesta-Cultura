package com.example.propuestaCultura.models;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name = "propuesta")
public class Propuesta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_propuesta")
    private Integer id_propuesta;
    @ManyToOne
    @JoinColumn(name = "id_solicitante",referencedColumnName = "id_solicitante")
    private Solicitante solicitante;
    @ManyToOne
    @JoinColumn(name="id_estado", referencedColumnName = "id_estado")
    private Estado  estado;
    @Column(name = "municipio")
    private Integer municipio;
    @Column(name = "nombre_popuesta")
    private String nombre_propuesta;
    @Column(name = "presentacion_general")
    private String presentacion_general;
    @Column(name = "fecha_presentacion_propuesta")
    private LocalDate fecha_presentacion_propuesta;
    @Column(name = "descripcion_actividades")
    private String descripcion_actividades;
    @Column(name = "publico_beneficiado")
    private String publico_beneficiado;
    @Column(name = "entidades_aliadas")
    private String entidades_aliadas;
    @Column(name = "contraprestaciones")
    private String contraprestaciones;
    @Column(name = "monto_total")
    private Double monto_total;
    @Column(name = "aporte_comfama_especie")
    private String aporte_comfama_especie;
    @Column(name = "porcentaje_aporte_comfama")
    private Double porcentaje_aporte_comfama;
    @Column(name = "trayectoria")
    private String trayectoria;

    public Integer getId_propuesta() {
        return id_propuesta;
    }

    public void setId_propuesta(Integer id_propuesta) {
        this.id_propuesta = id_propuesta;
    }

    public Solicitante getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(Solicitante solicitante) {
        this.solicitante = solicitante;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Integer getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Integer municipio) {
        this.municipio = municipio;
    }

    public String getNombre_propuesta() {
        return nombre_propuesta;
    }

    public void setNombre_propuesta(String nombre_propuesta) {
        this.nombre_propuesta = nombre_propuesta;
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
