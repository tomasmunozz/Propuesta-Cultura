package com.example.propuestaCultura.services;

import com.example.propuestaCultura.models.Estado;
import com.example.propuestaCultura.repositories.IEstadosRepositorio;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstadoServicio {

    @Autowired
    IEstadosRepositorio iEstadosRepositorio;

    //se listan los métodos para accionar la lógica del negocio
    //guardar en la BD un estado
    public Estado agregarEstado (Estado datosEstado) throws Exception{
        try{
            //Aplico las validaciones necesarias.

            //Llama al repo e intenta realizar la validación en la BD.
            return this.iEstadosRepositorio.save(datosEstado);
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }
    //buscar todos los estados que hay en una BD
    public List<Estado> buscarTodosLosEstados()throws Exception{
        try {
            return this.iEstadosRepositorio.findAll();

        }catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }
    //buscar un estado por ID
    public Estado buscarEstadoPorID(Integer id) throws Exception {
        try {
           if (this.iEstadosRepositorio.findById(id).isPresent()){
               return this.iEstadosRepositorio.findById(id).get();
           }else{
               throw new Exception("Estado no encontrado.");
           }
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }
    /*//modificar el nombre de un estado
    public Estado modificarEstado(Integer id, Estado datosModificar){

    }
    //eliminar un estado de la BD
    public Boolean eliminarEstado(Integer id){

    }*/
}
