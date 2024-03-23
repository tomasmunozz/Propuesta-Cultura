package com.example.propuestaCultura.controlers;

import com.example.propuestaCultura.models.Estado;
import com.example.propuestaCultura.models.Notificacion;
import com.example.propuestaCultura.services.EstadoServicio;
import com.example.propuestaCultura.services.NotificacionServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/notificacion")
public class NotificacionControlador {
    @Autowired
    NotificacionServicio notificacionServicio;
    @PostMapping
    public ResponseEntity<Notificacion> agregarNotificacion(@RequestBody Notificacion datosNotificacion){
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(notificacionServicio.agregarNotificacion(datosNotificacion));
        }catch (Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(null);
        }

    }
    @GetMapping
    public ResponseEntity<List<Notificacion>> buscarTodos(){
        try {
            return ResponseEntity
                    .status(HttpStatus.FOUND)
                    .body(notificacionServicio.buscarTodasLasNotificaciones());
        }catch (Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(null);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Notificacion>buscarPorID(@PathVariable Integer id){
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(notificacionServicio.buscarNotificacionPorID(id));

        }catch (Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(null);
        }
    }
}


