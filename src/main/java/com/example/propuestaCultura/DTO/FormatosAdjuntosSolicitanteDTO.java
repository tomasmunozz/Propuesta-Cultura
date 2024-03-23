package com.example.propuestaCultura.DTO;

public class FormatosAdjuntosSolicitanteDTO {
    private String nombre_inhabilidades;
    private String nombre_extradata;

    public FormatosAdjuntosSolicitanteDTO(String nombre_inhabilidades, String nombre_extradata) {
        this.nombre_inhabilidades = nombre_inhabilidades;
        this.nombre_extradata = nombre_extradata;
    }

    public FormatosAdjuntosSolicitanteDTO() {
    }

    public String getNombre_inhabilidades() {
        return nombre_inhabilidades;
    }

    public void setNombre_inhabilidades(String nombre_inhabilidades) {
        this.nombre_inhabilidades = nombre_inhabilidades;
    }

    public String getNombre_extradata() {
        return nombre_extradata;
    }

    public void setNombre_extradata(String nombre_extradata) {
        this.nombre_extradata = nombre_extradata;
    }
}
