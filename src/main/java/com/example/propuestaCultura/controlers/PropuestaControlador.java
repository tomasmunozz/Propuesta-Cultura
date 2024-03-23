package com.example.propuestaCultura.controlers;

import com.example.propuestaCultura.models.Notificacion;
import com.example.propuestaCultura.models.Propuesta;
import com.example.propuestaCultura.services.NotificacionServicio;
import com.example.propuestaCultura.services.PropuestaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("api/v1/propuesta")
public class PropuestaControlador {
    @Autowired
    PropuestaServicio propuestaServicio;
    @PostMapping
    public ResponseEntity<Propuesta> agregarPropuesta(@RequestBody Propuesta datosPropuesta){
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(propuestaServicio.agregarPropuesta(datosPropuesta));
        }catch (Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(null);
        }

    }
    @GetMapping
    public ResponseEntity<List<Propuesta>> buscarTodos(){
        try {
            return ResponseEntity
                    .status(HttpStatus.FOUND)
                    .body(propuestaServicio.buscarTodasLasPropuestas());
        }catch (Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(null);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Propuesta>buscarPorID(@PathVariable Integer id){
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(propuestaServicio.buscarPropuestaPorID(id));

        }catch (Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(null);
        }
    }
}
