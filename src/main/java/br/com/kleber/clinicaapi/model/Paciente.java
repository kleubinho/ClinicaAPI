package br.com.kleber.clinicaapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Paciente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPaciente;
	
	@Column(length = 100, nullable=false)
	private String nomePaciente;
	
	@Column(length = 100, nullable = false, unique = true)
	private String emailPaciente;
	
	@Column
	private String telefonePaciente;

	public Paciente() {
	}

	public Paciente(Long idPaciente, String nomePaciente, String emailPaciente, String telefonePaciente) {
		this.idPaciente = idPaciente;
		this.nomePaciente = nomePaciente;
		this.emailPaciente = emailPaciente;
		this.telefonePaciente = telefonePaciente;
	}

	public Long getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(Long idPaciente) {
		this.idPaciente = idPaciente;
	}

	public String getNomePaciente() {
		return nomePaciente;
	}

	public void setNomePaciente(String nomePaciente) {
		this.nomePaciente = nomePaciente;
	}

	public String getEmailPaciente() {
		return emailPaciente;
	}

	public void setEmailPaciente(String emailPaciente) {
		this.emailPaciente = emailPaciente;
	}

	public String getTelefonePaciente() {
		return telefonePaciente;
	}

	public void setTelefonePaciente(String telefonePaciente) {
		this.telefonePaciente = telefonePaciente;
	}
	
	
	
}
