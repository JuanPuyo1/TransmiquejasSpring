package edu.ucentral.serviciotramites.model;

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
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import edu.ucentral.serviciopsqr.model.Psqr;




@Entity
@Table(name="respuestas")
public class Respuesta implements Serializable{

	


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@NotEmpty(message="No puede estar vacio")
	private String Respuesta;
	
	@Column(name="create_at")
	@Temporal(TemporalType.DATE)
	private Date createAt;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "psqr_id")
	@JsonIgnoreProperties(value = {"applications", "hibernateLazyInitializer"})
	private Psqr psqr;
	
	
	@PrePersist
	public void prePersist() {
		createAt = new Date();
	}
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRespuesta() {
		return Respuesta;
	}

	public void setRespuesta(String respuesta) {
		Respuesta = respuesta;
	}


	public Date getCreateAt() {
		return createAt;
	}



	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}



	public Psqr getPsqr() {
		return psqr;
	}

	public void setPsqr(Psqr psqr) {
		this.psqr = psqr;
	}


	/**
	 * 
	 */
	private static final long serialVersionUID = 3162041956732066381L;
    
}
