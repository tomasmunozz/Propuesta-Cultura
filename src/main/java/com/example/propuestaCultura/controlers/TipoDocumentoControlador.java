package com.example.propuestaCultura.controlers;

import com.example.propuestaCultura.models.Notificacion;
import com.example.propuestaCultura.models.Solicitante;
import com.example.propuestaCultura.models.TipoDocumento;
import com.example.propuestaCultura.services.TipoDocumentoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/tipoDocumento")
public class TipoDocumentoControlador {
    @Autowired
    TipoDocumentoServicio tipoDocumentoServicio;

    @PostMapping
    public ResponseEntity<TipoDocumento> agregarTipoDocumento(@RequestBody TipoDocumento datosTipoDocumento){
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(tipoDocumentoServicio.agregarTipoDocumento(datosTipoDocumento));
        }catch (Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(null);
        }
    }

    @GetMapping
    public ResponseEntity<List<TipoDocumento>> buscarTodos(){
        try {
            return ResponseEntity
                    .status(HttpStatus.FOUND)
                    .body(tipoDocumentoServicio.buscarTodosLosDocumentos());
        }catch (Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(null);
        }
    }
    @GetMapping("/{id}")
    public ResponseEntity<TipoDocumento>buscarPorID(@PathVariable Integer id){
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(tipoDocumentoServicio.buscarTipoDocumentoPorID(id));

        }catch (Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(null);
        }
    }
}
