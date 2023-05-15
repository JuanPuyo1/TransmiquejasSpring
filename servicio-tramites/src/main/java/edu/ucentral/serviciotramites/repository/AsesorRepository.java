package edu.ucentral.serviciotramites.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import edu.ucentral.serviciotramites.model.Asesor;

public interface AsesorRepository extends JpaRepository<Asesor, Long> {
	
}