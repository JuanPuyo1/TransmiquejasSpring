package edu.ucentral.serviciousuarios.controller;


import java.util.Optional;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.ucentral.commonpasajero.model.Pasajero;
import edu.ucentral.commonsservice.controller.CommonController;
import edu.ucentral.serviciousuarios.service.PasajeroService;

@RestController
public class PasajeroController extends CommonController<Pasajero,PasajeroService> {

	@PutMapping("/{id}")
	public ResponseEntity<?> editar(@Valid @RequestBody Pasajero estudiante, @PathVariable Long id, BindingResult result){
		if(result.hasErrors()) {
			return this.validar(result);
		}
		Optional<Pasajero> optional = service.findById(id);
		if(!optional.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		
		Pasajero estudianteBd = optional.get();
		estudianteBd.setApellido(estudiante.getApellido());
		estudianteBd.setCodigo(estudiante.getCodigo());
		estudianteBd.setEmail(estudiante.getEmail());
		estudianteBd.setNombre(estudiante.getNombre());
		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(estudianteBd));
	}
	
	@GetMapping("/filtrar/{termino}")
	public ResponseEntity<?> filtratPorNombreOrApellido(@PathVariable String termino){
		return ResponseEntity.ok(service.findByNombreOrApellido(termino));
	}
	
}

