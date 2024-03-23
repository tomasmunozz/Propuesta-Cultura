package com.example.propuestaCultura.services;

import com.example.propuestaCultura.models.Propuesta;
import com.example.propuestaCultura.models.RespuestaPropuesta;
import com.example.propuestaCultura.repositories.IPropuestaRepositorio;
import com.example.propuestaCultura.repositories.IRespuestaPropuestaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RespuestaPropuestaServicio {

    @Autowired
    IRespuestaPropuestaRepositorio iRespuestaPropuestaRepositorio;

    public RespuestaPropuesta agregarRespuestaPropuesta(RespuestaPropuesta datosRespuestaPropuesta) throws Exception{
        try {
            return this.iRespuestaPropuestaRepositorio.save(datosRespuestaPropuesta);
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }
    public List<RespuestaPropuesta> buscarTodasLasRespuestaPropuesta()throws Exception{
        try {
            return this.iRespuestaPropuestaRepositorio.findAll();

        }catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    public RespuestaPropuesta buscarRespuestaPropuestaPorID(Integer id) throws Exception {
        try {
            if (this.iRespuestaPropuestaRepositorio.findById(id).isPresent()) {
                return this.iRespuestaPropuestaRepositorio.findById(id).get();
            } else {
                throw new Exception("Respuesta/propuesta no encontrada.");
            }
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }
}
