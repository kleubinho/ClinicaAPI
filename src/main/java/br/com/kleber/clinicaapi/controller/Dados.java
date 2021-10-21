package br.com.kleber.clinicaapi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.kleber.clinicaapi.model.Cliente;
import br.com.kleber.clinicaapi.repository.DadosRepository;



/*
 * Em nosso projeto iremos utilizar algumas anotações(annotations) que
 * são elementos de tipifição de código, ou seja, são aplicação
 * fazemos no código para informar o que aquela linha ou grupo de comando
 * deve fazer e como deve ser entendido.
 * no caso abaixo estamos dizendo que nossa classe, Dados é um controlador 
 * de fluxo que receberá comandos em Rest e responderá dados no formato Rest.
 * 
 */
@RestController
@RequestMapping("/")
public class Dados{
	
	@Autowired
	private DadosRepository dr;
	
	@PostMapping("/cad")
	public String cadastro(@RequestBody Cliente cliente) {
		dr.save(cliente);
		return "Cliente cadastrado com sucesso!";
	}
	
	public List<Cliente> clientes(){
		return dr.findAll();
	}
	
}
