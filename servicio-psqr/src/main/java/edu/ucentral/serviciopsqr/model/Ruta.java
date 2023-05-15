package edu.ucentral.serviciopsqr.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="rutas")
public class Ruta implements Serializable{


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@NotEmpty(message="No puede estar vacio")
	private String nombre_ruta;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNombre_ruta() {
		return nombre_ruta;
	}


	public void setNombre_ruta(String nombre_ruta) {
		this.nombre_ruta = nombre_ruta;
	}

	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		
		if(!(obj instanceof Ruta)) {
			return false;
		}
		
		Ruta g = (Ruta) obj;
		return this.id!=null && this.id.equals(g.getId());
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6925166609005375094L;
}
