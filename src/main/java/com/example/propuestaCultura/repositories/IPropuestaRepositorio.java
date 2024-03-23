package com.example.propuestaCultura.repositories;

import com.example.propuestaCultura.models.Propuesta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPropuestaRepositorio extends JpaRepository<Propuesta,Integer> {
}
