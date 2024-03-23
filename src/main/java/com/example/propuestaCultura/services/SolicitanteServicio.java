package com.example.propuestaCultura.services;

import com.example.propuestaCultura.models.Estado;
import com.example.propuestaCultura.models.Propuesta;
import com.example.propuestaCultura.models.Solicitante;
import com.example.propuestaCultura.repositories.IEstadosRepositorio;
import com.example.propuestaCultura.repositories.ISolicitanteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SolicitanteServicio {
    @Autowired
    ISolicitanteRepositorio iSolicitanteRepositorio;

    //se listan los métodos para accionar la lógica del negocio
    //guardar en la BD un estado
    public Solicitante agregarSolicitante (Solicitante datosSolicitante) throws Exception{
        try{
            //Aplico las validaciones necesarias.

            //Llama al repo e intenta realizar la validación en la BD.
            return this.iSolicitanteRepositorio.save(datosSolicitante);
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }
    //buscar todos los estados que hay en una BD
    public List<Solicitante> buscarTodosLosSolicitantes()throws Exception{
        try {
            return this.iSolicitanteRepositorio.findAll();

        }catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    public Solicitante buscarSolicitantePorID(Integer id) throws Exception {
        try {
            if (this.iSolicitanteRepositorio.findById(id).isPresent()) {
                return this.iSolicitanteRepositorio.findById(id).get();
            } else {
                throw new Exception("Solicitante no encontrado.");
            }
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }
}
