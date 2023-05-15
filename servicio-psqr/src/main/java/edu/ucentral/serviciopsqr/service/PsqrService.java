package edu.ucentral.serviciopsqr.service;

import java.util.Date;
import java.util.List;

import edu.ucentral.commonsservice.service.CommonService;
import edu.ucentral.serviciopsqr.model.Estacion;
import edu.ucentral.serviciopsqr.model.Estado;
import edu.ucentral.serviciopsqr.model.Motivo;
import edu.ucentral.serviciopsqr.model.Psqr;
import edu.ucentral.serviciopsqr.model.Ruta;
import edu.ucentral.serviciopsqr.model.TipoPsqr;


public interface PsqrService extends CommonService<Psqr> {
	
	public List<Psqr> findByPasajero(Long idPasajero);
	public List<Psqr> findByTipo(Long idTipoPsqr);
	public List<Psqr> findByEstacion(Long idEstacion);
	public List<Psqr> findByMotivo(Long idMotivo);
	public List<Psqr> findByRuta(Long idRuta);
	public List<Psqr> findByEstado(Long idEstado);
	public Psqr findPsqrByFecha(Date fecha);
	
	public Iterable<Estacion> findAllEstaciones();
	public Iterable<Estado> findAllEstados();
	public Iterable<Motivo> findAllMotivos();
	public Iterable<Ruta> findAllRuta();
	public Iterable<TipoPsqr> findAllTiposPsqr();
	
}

