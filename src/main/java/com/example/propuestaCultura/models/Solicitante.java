package com.example.propuestaCultura.models;

import jakarta.persistence.*;

@Entity
@Table(name = "solicitante")
public class Solicitante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_solicitante")
    private Integer id_solicitante;
    private String nombre_proponente;
    @ManyToOne
    @JoinColumn(name = "id_tipo_documento", referencedColumnName = "id_tipo_documento")
    private TipoDocumento tipoDocumento;
    @Column(name = "nombres")
    private String nombres;
    @Column(name = "apellidos")
    private String apellidos;
    @Column(name = "numero_documento")
    private String numero_documento;

    @Column(name = "telefono_fijo")
    private String telefono_fijo;
    @Column(name = "telefono_celular")
    private String telefono_celular;
    @Column(name = "correo_electronico")
    private String correo_electronico;

    public Integer getId_solicitante() {
        return id_solicitante;
    }

    public void setId_solicitante(Integer id_solicitante) {
        this.id_solicitante = id_solicitante;
    }

    public String getNombre_proponente() {
        return nombre_proponente;
    }

    public void setNombre_proponente(String nombre_proponente) {
        this.nombre_proponente = nombre_proponente;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
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

    public String getTelefono_fijo() {
        return telefono_fijo;
    }

    public void setTelefono_fijo(String telefono_fijo) {
        this.telefono_fijo = telefono_fijo;
    }

    public String getTelefono_celular() {
        return telefono_celular;
    }

    public void setTelefono_celular(String telefono_celular) {
        this.telefono_celular = telefono_celular;
    }

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }
}
