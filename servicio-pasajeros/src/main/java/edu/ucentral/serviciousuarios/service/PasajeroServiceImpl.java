package edu.ucentral.serviciousuarios.service;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.ucentral.commonpasajero.model.Pasajero;
import edu.ucentral.commonsservice.service.CommonServiceImpl;
import edu.ucentral.serviciousuarios.repository.PasajeroRepository;


@Service
public class PasajeroServiceImpl extends CommonServiceImpl<Pasajero,PasajeroRepository> implements PasajeroService {

	@Override
	public List<Pasajero> findByNombreOrApellido(String temino) {
		return repository.findByNombreOrApellido(temino);
	}

}
