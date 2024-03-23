package com.example.propuestaCultura.controlers;

import com.example.propuestaCultura.models.Estado;
import com.example.propuestaCultura.services.EstadoServicio;
import jakarta.persistence.GeneratedValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/estado")
public class EstadosControlador {
    @Autowired
    EstadoServicio estadoServicio;
    @PostMapping
    public ResponseEntity<Estado> agregarEstado(@RequestBody Estado datosEstado){
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(estadoServicio.agregarEstado(datosEstado));
        }catch (Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(null);
        }
    }
    @GetMapping
    public ResponseEntity<List<Estado>> buscarTodos(){
        try {
            return ResponseEntity
                    .status(HttpStatus.FOUND)
                    .body(estadoServicio.buscarTodosLosEstados());
        }catch (Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(null);
        }
    }
    @GetMapping("/{id}")
    public ResponseEntity<Estado>buscarPorID(@PathVariable Integer id){
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(estadoServicio.buscarEstadoPorID(id));

        }catch (Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(null);
        }
    }

}
