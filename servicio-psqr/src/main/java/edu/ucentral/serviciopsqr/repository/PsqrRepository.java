package edu.ucentral.serviciopsqr.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import edu.ucentral.commonpasajero.model.Pasajero;
import edu.ucentral.serviciopsqr.model.Estacion;
import edu.ucentral.serviciopsqr.model.Estado;
import edu.ucentral.serviciopsqr.model.Motivo;
import edu.ucentral.serviciopsqr.model.Psqr;
import edu.ucentral.serviciopsqr.model.Ruta;
import edu.ucentral.serviciopsqr.model.TipoPsqr;



public interface PsqrRepository extends JpaRepository<Psqr, Long> {

	public List<Psqr> findByPasajero(Pasajero pasajero);
	public List<Psqr> findByTipo(TipoPsqr tipoPsqr);
	public List<Psqr> findByEstacion(Estacion estacion);
	public List<Psqr> findByRuta(Ruta ruta);
	public List<Psqr> findByMotivo(Motivo motivo);
	public List<Psqr> findByEstado(Estado Estado);
	
}

