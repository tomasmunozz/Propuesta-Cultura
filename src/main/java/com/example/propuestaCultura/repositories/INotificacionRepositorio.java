package com.example.propuestaCultura.repositories;

import com.example.propuestaCultura.models.Notificacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface INotificacionRepositorio extends JpaRepository<Notificacion,Integer> {
}
