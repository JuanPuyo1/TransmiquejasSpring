package edu.ucentral.serviciopsqr.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;


@Entity
@Table(name="estados")
public class Estado implements Serializable{


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@NotEmpty(message="No puede estar vacio")
	private String descripcion_estado;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getDescripcion_estado() {
		return descripcion_estado;
	}


	public void setDescripcion_estado(String descripcion_estado) {
		this.descripcion_estado = descripcion_estado;
	}
	
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		
		if(!(obj instanceof Estado)) {
			return false;
		}
		
		Estado g = (Estado) obj;
		return this.id!=null && this.id.equals(g.getId());
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6570330978667949361L;
}
