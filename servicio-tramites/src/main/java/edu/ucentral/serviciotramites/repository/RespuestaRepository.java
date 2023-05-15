package edu.ucentral.serviciotramites.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import edu.ucentral.serviciotramites.model.Respuesta;



public interface RespuestaRepository extends JpaRepository<Respuesta, Long> {
	
}
