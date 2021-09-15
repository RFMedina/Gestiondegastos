package com.gdg.gestiondegastos.repositories;

import com.gdg.gestiondegastos.entities.Presupuesto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PresupuestoRepository extends JpaRepository<Presupuesto,Integer>{
}