package edu.ucentral.serviciopsqr.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="motivos")
public class Motivo implements Serializable{




	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@NotEmpty(message="No puede estar vacio")
	private String descripcion;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		
		if(!(obj instanceof Motivo)) {
			return false;
		}
		
		Motivo g = (Motivo) obj;
		return this.id!=null && this.id.equals(g.getId());
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = -5324733473885193596L;
}
