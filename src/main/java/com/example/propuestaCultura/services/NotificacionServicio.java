package com.example.propuestaCultura.services;

import com.example.propuestaCultura.models.Estado;
import com.example.propuestaCultura.models.Notificacion;
import com.example.propuestaCultura.repositories.INotificacionRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificacionServicio {
    @Autowired
    INotificacionRepositorio iNotificacionRepositorio;

    public Notificacion agregarNotificacion(Notificacion datosNotificacion) throws Exception{
        try {
            return this.iNotificacionRepositorio.save(datosNotificacion);
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }
    public List<Notificacion> buscarTodasLasNotificaciones()throws Exception{
        try {
            return this.iNotificacionRepositorio.findAll();

        }catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    public Notificacion buscarNotificacionPorID(Integer id) throws Exception {
        try {
            if (this.iNotificacionRepositorio.findById(id).isPresent()) {
                return this.iNotificacionRepositorio.findById(id).get();
            } else {
                throw new Exception("Notificación no encontrada.");
            }
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

}
