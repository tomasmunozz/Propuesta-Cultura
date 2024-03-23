package com.example.propuestaCultura.repositories;

import com.example.propuestaCultura.models.TipoDocumento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITipoDocumentoRepositorio extends JpaRepository<TipoDocumento,Integer> {
}
