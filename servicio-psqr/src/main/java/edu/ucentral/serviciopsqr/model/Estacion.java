package edu.ucentral.serviciopsqr.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="estaciones")
public class Estacion implements Serializable{


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@NotEmpty(message="No puede estar vacio")
	private String nombre_estacion;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNombre_estacion() {
		return nombre_estacion;
	}


	public void setNombre_estacion(String nombre_estacion) {
		this.nombre_estacion = nombre_estacion;
	}
	
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		
		if(!(obj instanceof Estacion)) {
			return false;
		}
		
		Estacion g = (Estacion) obj;
		return this.id!=null && this.id.equals(g.getId());
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3957141726429088104L;
}
