package br.com.kleber.clinicaapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.kleber.clinicaapi.model.Medico;

public interface MedicoRepository extends JpaRepository<Medico, Long>{

}
