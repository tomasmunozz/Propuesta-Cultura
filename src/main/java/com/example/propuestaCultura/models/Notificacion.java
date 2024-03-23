package com.example.propuestaCultura.models;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name = "notificacion")
public class Notificacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_notificacion")
    private Integer id_notificacion;
    @ManyToOne
    @JoinColumn(name = "id_propuesta", referencedColumnName = "id_propuesta")
    private Propuesta propuesta;
    @Column(name = "fecha_notificacion")
    private LocalDate fecha_notificacion;
    @Column(name = "mensaje_notificacion")
    private  String mensaje_notificacion;
    @Column(name = "notificaciones")
    private String notificaciones;

    public Notificacion() {
    }

    public Notificacion(Integer id_notificacion, Propuesta propuesta, LocalDate fecha_notificacion, String mensaje_notificacion, String notificaciones) {
        this.id_notificacion = id_notificacion;
        this.propuesta = propuesta;
        this.fecha_notificacion = fecha_notificacion;
        this.mensaje_notificacion = mensaje_notificacion;
        this.notificaciones = notificaciones;
    }

    public Integer getId_notificacion() {
        return id_notificacion;
    }

    public void setId_notificacion(Integer id_notificacion) {
        this.id_notificacion = id_notificacion;
    }

    public Propuesta getPropuesta() {
        return propuesta;
    }

    public void setPropuesta(Propuesta propuesta) {
        this.propuesta = propuesta;
    }

    public LocalDate getFecha_notificacion() {
        return fecha_notificacion;
    }

    public void setFecha_notificacion(LocalDate fecha_notificacion) {
        this.fecha_notificacion = fecha_notificacion;
    }

    public String getMensaje_notificacion() {
        return mensaje_notificacion;
    }

    public void setMensaje_notificacion(String mensaje_notificacion) {
        this.mensaje_notificacion = mensaje_notificacion;
    }

    public String getNotificaciones() {
        return notificaciones;
    }

    public void setNotificaciones(String notificaciones) {
        this.notificaciones = notificaciones;
    }
}
