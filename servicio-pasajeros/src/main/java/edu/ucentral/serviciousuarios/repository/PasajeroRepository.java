package edu.ucentral.serviciousuarios.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import edu.ucentral.commonpasajero.model.Pasajero;

public interface PasajeroRepository  extends PagingAndSortingRepository<Pasajero, Long> {
	@Query("SELECT e FROM Pasajero e WHERE e.nombre LIKE %?1% OR e.apellido LIKE %?1%")
	public List<Pasajero> findByNombreOrApellido(String temino);
}

