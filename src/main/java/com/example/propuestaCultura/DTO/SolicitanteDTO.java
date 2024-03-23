package com.example.propuestaCultura.DTO;

import com.example.propuestaCultura.models.TipoDocumento;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class SolicitanteDTO {
    private String nombre_proponente;

    private String tipo_documento;
    private String nombres;
    private String apellidos;
    private String numero_documento;

    public SolicitanteDTO() {
    }

    public SolicitanteDTO(String nombre_proponente, String tipo_documento, String nombres, String apellidos, String numero_documento) {
        this.nombre_proponente = nombre_proponente;
        this.tipo_documento = tipo_documento;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.numero_documento = numero_documento;
    }

    public String getNombre_proponente() {
        return nombre_proponente;
    }

    public void setNombre_proponente(String nombre_proponente) {
        this.nombre_proponente = nombre_proponente;
    }

    public String getTipo_documento() {
        return tipo_documento;
    }

    public void setTipo_documento(String tipo_documento) {
        this.tipo_documento = tipo_documento;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNumero_documento() {
        return numero_documento;
    }

    public void setNumero_documento(String numero_documento) {
        this.numero_documento = numero_documento;
    }
}
