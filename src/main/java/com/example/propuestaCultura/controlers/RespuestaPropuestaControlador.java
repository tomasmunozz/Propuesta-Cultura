package com.example.propuestaCultura.controlers;

import com.example.propuestaCultura.models.Propuesta;
import com.example.propuestaCultura.models.RespuestaPropuesta;
import com.example.propuestaCultura.services.PropuestaServicio;
import com.example.propuestaCultura.services.RespuestaPropuestaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("api/v1/respuestaPropuesta")
public class RespuestaPropuestaControlador {

    @Autowired
    RespuestaPropuestaServicio respuestaPropuestaServicio;
    @PostMapping
    public ResponseEntity<RespuestaPropuesta> agregarPropuestaRespuesta(@RequestBody RespuestaPropuesta datosRespuestaPropuesta){
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(respuestaPropuestaServicio.agregarRespuestaPropuesta(datosRespuestaPropuesta));
        }catch (Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(null);
        }

    }
    @GetMapping
    public ResponseEntity<List<RespuestaPropuesta>> buscarTodos(){
        try {
            return ResponseEntity
                    .status(HttpStatus.FOUND)
                    .body(respuestaPropuestaServicio.buscarTodasLasRespuestaPropuesta());
        }catch (Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(null);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<RespuestaPropuesta>buscarPorID(@PathVariable Integer id){
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(respuestaPropuestaServicio.buscarRespuestaPropuestaPorID(id));

        }catch (Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(null);
        }
    }
}
