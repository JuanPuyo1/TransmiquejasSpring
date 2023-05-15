package edu.ucentral.serviciopsqr.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import edu.ucentral.commonpasajero.model.Pasajero;

@Entity
@Table(name="psqr")
public class Psqr implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="create_at")
	@Temporal(TemporalType.DATE)
	private Date createAt;
	
	@PrePersist
	public void prePersist() {
		createAt = new Date(); 
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pasajero_id")
	@JsonIgnoreProperties(value = {"applications", "hibernateLazyInitializer"})
	private Pasajero pasajero;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_tipo")
	@JsonIgnoreProperties(value = {"applications", "hibernateLazyInitializer"})
	private TipoPsqr tipo;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_motivo")
	@JsonIgnoreProperties(value = {"applications", "hibernateLazyInitializer"})
	private Motivo motivo;

	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_ruta")
	@JsonIgnoreProperties(value = {"applications", "hibernateLazyInitializer"})
	private Ruta ruta;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_estacion")
	@JsonIgnoreProperties(value = {"applications", "hibernateLazyInitializer"})
	private Estacion estacion;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_estado")
	@JsonIgnoreProperties(value = {"applications", "hibernateLazyInitializer"})
	private Estado estado;
	
	
	
	
	public Ruta getRuta() {
		return ruta;
	}


	public Estacion getEstacion() {
		return estacion;
	}


	public Motivo getMotivo() {
		return motivo;
	}


	public void setMotivo(Motivo motivo) {
		this.motivo = motivo;
	}


	public Estado getEstado() {
		return estado;
	}


	public void setEstado(Estado estado) {
		this.estado = estado;
	}


	public void setRuta(Ruta ruta) {
		this.ruta = ruta;
	}


	public void setEstacion(Estacion estacion) {
		this.estacion = estacion;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}



	public Date getCreateAt() {
		return createAt;
	}


	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}


	public Pasajero getPasajero() {
		return pasajero;
	}


	public void setPasajero(Pasajero pasajero) {
		this.pasajero = pasajero;
	}
	
	
	public TipoPsqr getTipo() {
		return tipo;
	}


	public void setTipo(TipoPsqr tipo) {
		this.tipo = tipo;
	}


	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		
		if(!(obj instanceof Psqr)) {
			return false;
		}
		
		Psqr g = (Psqr) obj;
		return this.id!=null && this.id.equals(g.getId());
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7955283870378799962L;
}
