package com.example.propuestaCultura.services;

import com.example.propuestaCultura.models.FormatosAdjuntoSolicitante;
import com.example.propuestaCultura.models.Notificacion;
import com.example.propuestaCultura.repositories.IFormatosAdjuntosSolicitanteRepositorio;
import com.example.propuestaCultura.repositories.INotificacionRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FormatoAdjuntoSolicitanteServicio {

    @Autowired
    IFormatosAdjuntosSolicitanteRepositorio iFormatosAdjuntosSolicitanteRepositorio;

    public FormatosAdjuntoSolicitante agregarFormatoAdjuntoSolicitante(FormatosAdjuntoSolicitante datosFormatoAdjuntoSolicitante) throws Exception{
        try {
            return this.iFormatosAdjuntosSolicitanteRepositorio.save(datosFormatoAdjuntoSolicitante);
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }
    public List<FormatosAdjuntoSolicitante> buscarTodasLosFormatosAdjuntosSolicitante()throws Exception{
        try {
            return this.iFormatosAdjuntosSolicitanteRepositorio.findAll();

        }catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    public FormatosAdjuntoSolicitante buscarFormatoAdjuntoSolicitantePorID (Integer id) throws Exception {
        try {
            if (this.iFormatosAdjuntosSolicitanteRepositorio.findById(id).isPresent()) {
                return this.iFormatosAdjuntosSolicitanteRepositorio.findById(id).get();
            } else {
                throw new Exception("Formato adjunto de solicitante no encontrado.");
            }
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }
}
