package br.com.kleber.clinicaapi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.kleber.clinicaapi.model.Paciente;
import br.com.kleber.clinicaapi.repository.PacienteRepository;

@RestController
@RequestMapping("/paciente")
public class PacienteController {
	
	@Autowired
	private PacienteRepository pr;
	
	@GetMapping("/listar")
	public List<Paciente> listar(){
		return pr.findAll();
		
	}
	
	@PostMapping("/cadastro")
	public String cadastro(@RequestBody Paciente paciente) {
		pr.save(paciente);
		return "Paciente cadastrado com sucesso";
	}
	
	@PutMapping("/atualizar/{id}")
	public String atualizar(@PathVariable Long id,@RequestBody Paciente paciente) {
		
		Optional<Paciente> pac = pr.findById(id);
		if(!pac.isPresent()) {
			return "Paciente não encontrado!";
		}
		paciente.setIdPaciente(id);
		pr.save(paciente);
		return "Dados do paciente atulizados";
	}
	
	@DeleteMapping("/apagar/{id}")
	public String apagar(@PathVariable Long id) {
		pr.deleteById(id);
		return "Paciente apagado";
	}
}
