package com.example.propuestaCultura.repositories;

import com.example.propuestaCultura.models.Solicitante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISolicitanteRepositorio extends JpaRepository<Solicitante,Integer> {
}
