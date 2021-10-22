package br.com.kleber.clinicaapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.kleber.clinicaapi.model.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Long>{

}
