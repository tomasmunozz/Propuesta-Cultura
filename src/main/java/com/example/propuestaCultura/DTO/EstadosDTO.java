package com.example.propuestaCultura.DTO;

public class EstadosDTO {

    private String nombre_estado;

    public EstadosDTO() {
    }

    public EstadosDTO(String nombre_estado) {
        this.nombre_estado = nombre_estado;
    }

    public String getNombre_estado() {
        return nombre_estado;
    }

    public void setNombre_estado(String nombre_estado) {
        this.nombre_estado = nombre_estado;
    }
}
