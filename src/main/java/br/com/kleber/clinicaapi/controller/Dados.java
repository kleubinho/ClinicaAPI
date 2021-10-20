package br.com.kleber.clinicaapi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.kleber.clinicaapi.model.Cliente;



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
public class Dados {
	
	@GetMapping
	public String inicial() {
		return "Olá, você está na pagina inicial do projeto.";
	}

	@GetMapping("/cliente")
	public String cliente() {
		return "Henrique Felix";
	}
	
	@GetMapping("/clientes")
	public List<Cliente> clientes() {
		List<Cliente> lst = new ArrayList<Cliente>();
		Cliente c1 = new Cliente();
		Cliente c2 = new Cliente();
		
		c1.setNome("Kleber");
		c2.setNome("Henrique");
		
		lst.add(c1);
		lst.add(c2);
		
		return lst;
	}
	
	@PostMapping("/cadastro")
	public String cadastro() {	
		return "Cadastro realizado";
	}
	
	@PutMapping("/atualizar")
	public String atualizar() {
		return "Dados atualizado!";
	}
	
	@DeleteMapping("/deletar")
	public String deletar() {
		return "Dados deletados";
	}
}
