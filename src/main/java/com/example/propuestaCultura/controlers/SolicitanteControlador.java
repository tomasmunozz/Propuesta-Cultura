package com.example.propuestaCultura.controlers;

import com.example.propuestaCultura.models.Notificacion;
import com.example.propuestaCultura.models.Propuesta;
import com.example.propuestaCultura.models.Solicitante;
import com.example.propuestaCultura.services.NotificacionServicio;
import com.example.propuestaCultura.services.SolicitanteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("api/v1/solicitante")
public class SolicitanteControlador {
    @Autowired
    SolicitanteServicio solicitanteServicio;
    @PostMapping
    public ResponseEntity<Solicitante> agregarSolicitante(@RequestBody Solicitante datosSolicitante){
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(solicitanteServicio.agregarSolicitante(datosSolicitante));
        }catch (Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(null);
        }

    }
    @GetMapping
    public ResponseEntity<List<Solicitante>> buscarTodos(){
        try {
            return ResponseEntity
                    .status(HttpStatus.FOUND)
                    .body(solicitanteServicio.buscarTodosLosSolicitantes());
        }catch (Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(null);
        }
    }
    @GetMapping("/{id}")
    public ResponseEntity<Solicitante>buscarPorID(@PathVariable Integer id){
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(solicitanteServicio.buscarSolicitantePorID(id));

        }catch (Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(null);
        }
    }
}
