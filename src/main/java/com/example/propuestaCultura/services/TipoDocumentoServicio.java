package com.example.propuestaCultura.services;

import com.example.propuestaCultura.models.Notificacion;
import com.example.propuestaCultura.models.Solicitante;
import com.example.propuestaCultura.models.TipoDocumento;
import com.example.propuestaCultura.repositories.IEstadosRepositorio;
import com.example.propuestaCultura.repositories.ITipoDocumentoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoDocumentoServicio {
    @Autowired
    ITipoDocumentoRepositorio tipoDocumentoRepositorio;

    public TipoDocumento agregarTipoDocumento(TipoDocumento datosTipoDocumento) throws Exception{
        try {
            return this.tipoDocumentoRepositorio.save(datosTipoDocumento);
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }
    public List<TipoDocumento> buscarTodosLosDocumentos()throws Exception{
        try {
            return this.tipoDocumentoRepositorio.findAll();

        }catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }
    public TipoDocumento buscarTipoDocumentoPorID(Integer id) throws Exception {
        try {
            if (this.tipoDocumentoRepositorio.findById(id).isPresent()) {
                return this.tipoDocumentoRepositorio.findById(id).get();
            } else {
                throw new Exception("Tipo de documento no encontrado.");
            }
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }
}
