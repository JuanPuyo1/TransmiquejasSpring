package edu.ucentral.serviciotramites.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import edu.ucentral.commonsservice.service.CommonServiceImpl;
import edu.ucentral.serviciotramites.model.Asesor;
import edu.ucentral.serviciotramites.model.Respuesta;
import edu.ucentral.serviciotramites.model.Tramitador;
import edu.ucentral.serviciotramites.repository.AsesorRepository;
import edu.ucentral.serviciotramites.repository.RespuestaRepository;
import edu.ucentral.serviciotramites.repository.TramitadorRepository;


@Service
public class RespuestaServiceImpl extends CommonServiceImpl<Respuesta, RespuestaRepository> implements RespuestaService{
	
	
	@Autowired
	private TramitadorRepository repoTramitador;


	
	@Autowired
	private AsesorRepository repoAsesor;
	
	@Override
	@Transactional(readOnly = true)
	public Iterable<Tramitador> findAllTramitadores() {
		return repoTramitador.findAll();
	}

	
	/*
	@Override
	public void AsginarPsqrToAsesor(Long idPsqr) {
		
	}
	*/
	
	@Override
	public Optional<Asesor> findByAsesor(Long id) {
		return repoAsesor.findById(id);
	}


	@Override
	public Iterable<Asesor> findAllAsesores() {
		return repoAsesor.findAll();
	}


		 
	 

}
