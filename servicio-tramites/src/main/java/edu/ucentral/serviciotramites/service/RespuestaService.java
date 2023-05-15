package edu.ucentral.serviciotramites.service;


import java.util.Optional;
import edu.ucentral.commonsservice.service.CommonService;
import edu.ucentral.serviciotramites.model.Asesor;
import edu.ucentral.serviciotramites.model.Respuesta;
import edu.ucentral.serviciotramites.model.Tramitador;

public interface RespuestaService  extends CommonService<Respuesta>{
	

	//public void AsginarPsqrToAsesor(Long idAsesor);
	public Iterable<Tramitador> findAllTramitadores();
	public Iterable<Asesor> findAllAsesores();
	
	public Optional<Asesor> findByAsesor(Long id);
}
