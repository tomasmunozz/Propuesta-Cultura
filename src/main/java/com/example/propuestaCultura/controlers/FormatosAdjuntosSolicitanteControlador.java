package com.example.propuestaCultura.controlers;

import com.example.propuestaCultura.models.FormatosAdjuntoSolicitante;
import com.example.propuestaCultura.models.Notificacion;
import com.example.propuestaCultura.services.FormatoAdjuntoSolicitanteServicio;
import com.example.propuestaCultura.services.NotificacionServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/formatoAdjuntoSolicitante")
public class FormatosAdjuntosSolicitanteControlador {

    @Autowired
    FormatoAdjuntoSolicitanteServicio formatoAdjuntoSolicitanteServicio;
    @PostMapping
    public ResponseEntity<FormatosAdjuntoSolicitante> agregarFormatoAdjuntoSolicitante(@RequestBody FormatosAdjuntoSolicitante datosFormatoAdjuntoSolicitante){
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(formatoAdjuntoSolicitanteServicio.agregarFormatoAdjuntoSolicitante(datosFormatoAdjuntoSolicitante));
        }catch (Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(null);
        }

    }
    @GetMapping
    public ResponseEntity<List<FormatosAdjuntoSolicitante>> buscarTodos(){
        try {
            return ResponseEntity
                    .status(HttpStatus.FOUND)
                    .body(formatoAdjuntoSolicitanteServicio.buscarTodasLosFormatosAdjuntosSolicitante());
        }catch (Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(null);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<FormatosAdjuntoSolicitante>buscarPorID(@PathVariable Integer id){
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(formatoAdjuntoSolicitanteServicio.buscarFormatoAdjuntoSolicitantePorID(id));

        }catch (Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(null);
        }
    }
}
