package edu.ucentral.serviciopsqr.controller;

import java.util.Date;
import java.util.Optional;
import javax.validation.Valid;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.ucentral.commonsservice.controller.CommonController;
import edu.ucentral.serviciopsqr.model.Psqr;
import edu.ucentral.serviciopsqr.service.PsqrService;

@RestController
public class PsqrController extends CommonController<Psqr, PsqrService>{
	
	
	
	@PutMapping("/{id}")
	public ResponseEntity<?> editar(@Valid @RequestBody Psqr psqr, @PathVariable Long id, BindingResult result){
		if(result.hasErrors()) {
			return this.validar(result);
		}
		Optional<Psqr> optional = service.findById(id); 
		if(!optional.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		
		Psqr psqrBd = optional.get();
		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(psqrBd));
	}
	
	@GetMapping("/estaciones")
	public ResponseEntity<?> listarEstaciones(){
		return ResponseEntity.ok(service.findAllEstaciones());
	}
	
	@GetMapping("/estados")
	public ResponseEntity<?> listarEstados(){
		return ResponseEntity.ok(service.findAllEstados());
	}
	
	@GetMapping("/motivos")
	public ResponseEntity<?> listarMotivos(){
		return ResponseEntity.ok(service.findAllMotivos());
	}
	
	@GetMapping("/rutas")
	public ResponseEntity<?> listarRutas(){
		return ResponseEntity.ok(service.findAllRuta());
	}
	
	@GetMapping("/tipos")
	public ResponseEntity<?> listarTipos(){
		return ResponseEntity.ok(service.findAllTiposPsqr());
	}
	
	//////////////

	@GetMapping("/pasajero/{id}")
	public ResponseEntity<?> ListarPorPasajero( @PathVariable Long id){
		return ResponseEntity.ok().body(service.findByPasajero(id));
	}
	
	@GetMapping("/tipo/{id}")
		public ResponseEntity<?> ListarPorTipo( @PathVariable Long id){
		return ResponseEntity.ok().body(service.findByTipo(id));
	}

	
	@GetMapping("/estacion/{id}")
	public ResponseEntity<?> ListarPorEstacion( @PathVariable Long idEstacion){
		return ResponseEntity.ok().body(service.findByEstacion(idEstacion));
	}
	
	@GetMapping("/ruta/{id}")
	public ResponseEntity<?> ListarPorRuta( @PathVariable Long idruta){
		return ResponseEntity.ok().body(service.findByRuta(idruta));
	}
	
	@GetMapping("/motivo/{id}")
	public ResponseEntity<?> ListarPorMotivo( @PathVariable Long idMotivo){
		return ResponseEntity.ok().body(service.findByMotivo(idMotivo));
	}
	
	@GetMapping("/estado/{id}")
	public ResponseEntity<?> ListarPorEstado( @PathVariable Long idEstado){
		return ResponseEntity.ok().body(service.findByEstado(idEstado));
	}
	
	@GetMapping("/fecha/{fecha}")
	public ResponseEntity<?> ListarPorFecha(@PathVariable ("fecha") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) Date fecha){
		return ResponseEntity.ok().body(service.findPsqrByFecha(fecha));
	}
}
