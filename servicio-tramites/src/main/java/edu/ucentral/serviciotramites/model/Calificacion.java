package edu.ucentral.serviciotramites.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "calificaciones")
public class Calificacion implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotEmpty(message = "No puede estar vacio")
	private String detalle;

    @OneToOne
    @JoinColumn(name = "id_respuesta", updatable = false, nullable = false)
    private Respuesta respuesta;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public Respuesta getRespuesta() {
		return respuesta;
	}

	public void setRespuesta(Respuesta respuesta) {
		this.respuesta = respuesta;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -395718763543803521L;

}
