package edu.ucentral.serviciotramites.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import edu.ucentral.serviciopsqr.model.Psqr;

@Entity
@Table(name="asesores")
public class Asesor implements Serializable{

	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotEmpty(message="No puede estar vacio")
	private String codigo;
	@NotEmpty(message="No puede estar vacio")
	@Size(min = 3, max = 30, message="El numero de caracteres debe estar entre 3 y 30")
	private String nombre;
	@NotEmpty(message="No puede estar vacio")
	@Size(min = 3, max = 30, message="El numero de caracteres debe estar entre 3 y 30")
	private String apellido;
	@NotEmpty(message="No puede estar vacio")
	@Email(message="No es una direccion de correo valida")
	private String email;
	@Column(name="create_at")
	@Temporal(TemporalType.DATE)
	private Date createAt;
	
	
    @JoinTable(
            name = "asesor_psqr",
            joinColumns = @JoinColumn(name = "id_asesor", nullable = false),
            inverseJoinColumns = @JoinColumn(name="id_psqr", nullable = false)
        )
        @ManyToMany(cascade = CascadeType.ALL)
    	@JsonIgnore
        private List<Psqr> psqr;
       
        public void addPsqr(Psqr psqr){
            if(this.psqr == null){
                this.psqr = new ArrayList<>();
            }
            
            this.psqr.add(psqr);
        }
        
        
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_tramitador")
    @JsonIgnoreProperties(value = {"applications", "hibernateLazyInitializer"})
    private Tramitador tramitador;
	
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
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	
	public Tramitador getTramitador() {
		return tramitador;
	}

	public void setTramitador(Tramitador tramitador) {
		this.tramitador = tramitador;
	}

	
	
	public List<Psqr> getPsqr() {
		return psqr;
	}

	public void setPsqr(List<Psqr> psqr) {
		this.psqr = psqr;
	}

	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		
		if(!(obj instanceof Asesor)) {
			return false;
		}
		
		Asesor e = (Asesor)obj;
		return this.id!=null && this.id.equals(e.getId());
	}
	
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1301691901382804067L;
}
