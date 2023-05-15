package edu.ucentral.serviciotramites.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import edu.ucentral.serviciotramites.model.Asesor;
import edu.ucentral.serviciotramites.model.Tramitador;

public interface TramitadorRepository extends JpaRepository<Tramitador, Long> {
	
	
	/*
	@Modifying
	@Query(
	  value = 
	    "insert into Users (name, age, email, status) values (:name, :age, :email, :status)",
	  nativeQuery = true)
	*/
	
	//public void AsginarPsqrToAsesor(Asesor asesor);
	
	
}
