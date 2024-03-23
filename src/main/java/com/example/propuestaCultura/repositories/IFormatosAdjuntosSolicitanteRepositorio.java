package com.example.propuestaCultura.repositories;

import com.example.propuestaCultura.models.FormatosAdjuntoSolicitante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFormatosAdjuntosSolicitanteRepositorio extends JpaRepository<FormatosAdjuntoSolicitante,Integer> {
}
