package com.projectoCrud.repository;

import com.projectoCrud.models.Pasajero;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PasajeroRepository extends JpaRepository<Pasajero, Integer> {
}
