package com.example.propuestaCultura.services;

import com.example.propuestaCultura.models.Notificacion;
import com.example.propuestaCultura.models.Propuesta;
import com.example.propuestaCultura.repositories.INotificacionRepositorio;
import com.example.propuestaCultura.repositories.IPropuestaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PropuestaServicio {

    @Autowired
    IPropuestaRepositorio iPropuestaRepositorio;

    public Propuesta agregarPropuesta(Propuesta datosPropuesta) throws Exception{
        try {
            return this.iPropuestaRepositorio.save(datosPropuesta);
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }
    public List<Propuesta> buscarTodasLasPropuestas()throws Exception{
        try {
            return this.iPropuestaRepositorio.findAll();

        }catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    public Propuesta buscarPropuestaPorID(Integer id) throws Exception {
        try {
            if (this.iPropuestaRepositorio.findById(id).isPresent()) {
                return this.iPropuestaRepositorio.findById(id).get();
            } else {
                throw new Exception("Propuesta no encontrada.");
            }
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }
}
