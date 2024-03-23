package com.example.propuestaCultura.repositories;

import com.example.propuestaCultura.models.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEstadosRepositorio extends JpaRepository<Estado,Integer> {
    //IRÍAN CONSULTAS PERSONALIZADAS


}
