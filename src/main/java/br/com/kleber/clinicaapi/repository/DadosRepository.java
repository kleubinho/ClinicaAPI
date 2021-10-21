package br.com.kleber.clinicaapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.kleber.clinicaapi.model.Cliente;

public interface DadosRepository extends JpaRepository<Cliente, Long>{

}

