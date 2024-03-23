package com.example.propuestaCultura.DTO;

import java.time.LocalDate;

public class NotificacionesDTO {

    private LocalDate fecha_notificacion;
    private String mensaje_notificacion;
    private String observaciones;
    private String nombre_propuesta;

    public NotificacionesDTO() {
    }

    public NotificacionesDTO(LocalDate fecha_notificacion, String mensaje_notificacion, String observaciones, String nombre_propuesta) {
        this.fecha_notificacion = fecha_notificacion;
        this.mensaje_notificacion = mensaje_notificacion;
        this.observaciones = observaciones;
        this.nombre_propuesta = nombre_propuesta;
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

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getNombre_propuesta() {
        return nombre_propuesta;
    }

    public void setNombre_propuesta(String nombre_propuesta) {
        this.nombre_propuesta = nombre_propuesta;
    }
}
