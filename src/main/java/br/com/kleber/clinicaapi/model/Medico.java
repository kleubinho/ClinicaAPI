package br.com.kleber.clinicaapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Medico {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idMedico;
	
	@Column(length = 100, nullable = false)
	private String nomeMedico;
	
	@Column(length = 100, nullable = false, unique = true)
	private String crm;
	
	@Column
	private String telefoneMedico;

	public Medico() {
	}

	public Medico(Long idMedico, String nomeMedico, String crm, String telefoneMedico) {
		this.idMedico = idMedico;
		this.nomeMedico = nomeMedico;
		this.crm = crm;
		this.telefoneMedico = telefoneMedico;
	}

	public Long getIdMedico() {
		return idMedico;
	}

	public void setIdMedico(Long idMedico) {
		this.idMedico = idMedico;
	}

	public String getNomeMedico() {
		return nomeMedico;
	}

	public void setNomeMedico(String nomeMedico) {
		this.nomeMedico = nomeMedico;
	}

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	public String getTelefoneMedico() {
		return telefoneMedico;
	}

	public void setTelefoneMedico(String telefoneMedico) {
		this.telefoneMedico = telefoneMedico;
	}
	
	
}