package br.com.kleber.clinicaapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.kleber.clinicaapi.model.Agenda;

public interface AgendaRepository extends JpaRepository<Agenda, Long>{

}
