package edu.ucentral.serviciopsqr.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.ucentral.commonpasajero.model.Pasajero;
import edu.ucentral.commonsservice.service.CommonServiceImpl;
import edu.ucentral.serviciopsqr.model.Estacion;
import edu.ucentral.serviciopsqr.model.Estado;
import edu.ucentral.serviciopsqr.model.Motivo;
import edu.ucentral.serviciopsqr.model.Psqr;
import edu.ucentral.serviciopsqr.model.Ruta;
import edu.ucentral.serviciopsqr.model.TipoPsqr;
import edu.ucentral.serviciopsqr.repository.EstacionPsqrRepository;
import edu.ucentral.serviciopsqr.repository.EstadoPsqrRespository;
import edu.ucentral.serviciopsqr.repository.MotivoPsqrRepository;
import edu.ucentral.serviciopsqr.repository.PsqrRepository;
import edu.ucentral.serviciopsqr.repository.RutaPsqrRepository;
import edu.ucentral.serviciopsqr.repository.TipoPsqrRepository;

@Service
public class PsqrServiceImpl extends CommonServiceImpl<Psqr, PsqrRepository> implements PsqrService {
	
	@Autowired
	private EstacionPsqrRepository estacionrepo;
	
	@Autowired
	private EstadoPsqrRespository estadorepo;
	
	@Autowired
	private MotivoPsqrRepository motivorepo;
	
	@Autowired
	private RutaPsqrRepository rutarepo;
	
	@Autowired
	private TipoPsqrRepository tiporepo;
	
	
	@Override
	@Transactional(readOnly = true)
	public Iterable<Estacion> findAllEstaciones() {
		return estacionrepo.findAll();
	}
	
	@Override
	public Iterable<Estado> findAllEstados() {
		return estadorepo.findAll();
	}



	@Override
	public Iterable<Motivo> findAllMotivos() {
		return motivorepo.findAll();
	}



	@Override
	public Iterable<Ruta> findAllRuta() {
		return rutarepo.findAll();
	}



	@Override
	public Iterable<TipoPsqr> findAllTiposPsqr() {
		return tiporepo.findAll();
	}
	 
	 
	/////////////////////
	
	@Override
	public List<Psqr> findByPasajero(Long IdPasajero) {
		Pasajero pasajero = new Pasajero();
		pasajero.setId(IdPasajero);
		return repository.findByPasajero(pasajero);
	}

	
	
	@Override
	public List<Psqr> findByTipo(Long idTipoPsqr) {
		TipoPsqr tipoPsqr = new TipoPsqr();
		tipoPsqr.setId(idTipoPsqr);
		return repository.findByTipo(tipoPsqr);
	}



	@Override
	public List<Psqr> findByEstacion(Long idEstacion) {
		Estacion estacion = new Estacion();
		estacion.setId(idEstacion);
		
		return repository.findByEstacion(estacion);
	}



	@Override
	public List<Psqr> findByMotivo(Long idMotivo) {
		Motivo motivo  = new Motivo();
		motivo.setId(idMotivo);
		return repository.findByMotivo(motivo);
	}



	@Override
	public List<Psqr> findByRuta(Long idRuta) {
		Ruta ruta = new Ruta();
		ruta.setId(idRuta);
		return repository.findByRuta(ruta);
	}



	@Override
	public List<Psqr> findByEstado(Long idEstado) {
		Estado estado = new Estado();
		estado.setId(idEstado);
		return repository.findByEstado(estado);
	}



	@Override
	public Psqr findPsqrByFecha(Date fecha) {
		Psqr psqr = new Psqr();
		psqr.setCreateAt(fecha);
		return null;
	}



	

}
