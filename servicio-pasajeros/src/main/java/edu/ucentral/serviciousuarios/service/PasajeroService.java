package edu.ucentral.serviciousuarios.service;

import java.util.List;

import edu.ucentral.commonpasajero.model.Pasajero;
import edu.ucentral.commonsservice.service.CommonService;

public interface PasajeroService extends CommonService<Pasajero> {
	
	public List<Pasajero> findByNombreOrApellido(String temino);
	
}
