package edu.ucentral.serviciotramites.controller;

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
import edu.ucentral.commonsservice.controller.CommonController;
import edu.ucentral.serviciotramites.model.Asesor;
import edu.ucentral.serviciotramites.model.Respuesta;
import edu.ucentral.serviciotramites.service.RespuestaService;


@RestController
public class RespuestaController extends CommonController<Respuesta, RespuestaService>{
	
	
	
	@PutMapping("/{id}")
	public ResponseEntity<?> editar(@Valid @RequestBody Respuesta respuesta, @PathVariable Long id, BindingResult result){
		if(result.hasErrors()) {
			return this.validar(result);
		}
		Optional<Respuesta> optional = service.findById(id); 
		if(!optional.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		
		Respuesta respuestaBd = optional.get();
		respuestaBd.setRespuesta(respuesta.getRespuesta());
		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(respuestaBd));
	}
	
	
	@GetMapping("/tramitador/asignar/{idAsesor}")
	public ResponseEntity<?> AsignarAsesor(@PathVariable Long idAsesor,Long idPsqr){
		
		Optional<Asesor> optional = service.findByAsesor(idAsesor);
		
		return ResponseEntity.ok(optional.get());	
	}
	
	
	@GetMapping("/tramitadores")
	public ResponseEntity<?> listarTramitadores(){
		return ResponseEntity.ok(service.findAllTramitadores());
	}
	
	@GetMapping("/asesores")
	public ResponseEntity<?> listarAsesores(){
		return ResponseEntity.ok(service.findAllAsesores());
	}
}
	