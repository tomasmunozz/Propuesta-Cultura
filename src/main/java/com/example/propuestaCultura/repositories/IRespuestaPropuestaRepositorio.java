package com.example.propuestaCultura.repositories;

import com.example.propuestaCultura.models.RespuestaPropuesta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRespuestaPropuestaRepositorio extends JpaRepository<RespuestaPropuesta,Integer> {
}
