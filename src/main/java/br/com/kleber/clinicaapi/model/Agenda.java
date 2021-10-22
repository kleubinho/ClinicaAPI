package br.com.kleber.clinicaapi.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Agenda {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long IdAgenda;
	
	@Column
	private Long idMedico;
	
	@Column
	private Long idPaciente;
	
	@Column(nullable = false)
	private Date dataConsulta;
	
	@Column(nullable = false)
	private Date horaConsulta;
	
	@Column(nullable = false)
	private String especialidade;

	public Agenda() {
	}

	public Agenda(Long idAgenda, Long idMedico, Long idPaciente, Date dataConsulta, Date horaConsulta,
			String especialidade) {
		IdAgenda = idAgenda;
		this.idMedico = idMedico;
		this.idPaciente = idPaciente;
		this.dataConsulta = dataConsulta;
		this.horaConsulta = horaConsulta;
		this.especialidade = especialidade;
	}

	public Long getIdAgenda() {
		return IdAgenda;
	}

	public void setIdAgenda(Long idAgenda) {
		IdAgenda = idAgenda;
	}

	public Long getIdMedico() {
		return idMedico;
	}

	public void setIdMedico(Long idMedico) {
		this.idMedico = idMedico;
	}

	public Long getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(Long idPaciente) {
		this.idPaciente = idPaciente;
	}

	public Date getDataConsulta() {
		return dataConsulta;
	}

	public void setDataConsulta(Date dataConsulta) {
		this.dataConsulta = dataConsulta;
	}

	public Date getHoraConsulta() {
		return horaConsulta;
	}

	public void setHoraConsulta(Date horaConsulta) {
		this.horaConsulta = horaConsulta;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	
}
