package br.com.fernandes.controllers;

import java.util.Map;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fernandes.models.dto.TarefaDTO;
import br.com.fernandes.service.TarefaService;
import br.com.fernandes.validator.TarefaDTOValidator;

@RestController
@RequestMapping("/tarefa")
public class TarefaGeniusController {
	
	@Autowired
	TarefaService tarefaService;
	
	@Autowired
	private TarefaDTOValidator tarefaDtoValidator;
	
	@GetMapping("/health")
	public ResponseEntity<String> checkHealth(){
		String status = "Aplicação está saudável";
		return new ResponseEntity<String>(status, HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<Object> listaTodasTarefas(){
		return ResponseEntity.status(HttpStatus.OK).contentType(MediaType.APPLICATION_JSON).body(tarefaService.listaTodasTarefas());
	}
	
	@PostMapping
	public ResponseEntity<Object> criaTarefa(@Valid @RequestBody @NotEmpty TarefaDTO tarefaDTO, BindingResult bindingResult){
		tarefaDtoValidator.validate(tarefaDTO, bindingResult);
		
		if(bindingResult.hasErrors()) {
			return ResponseEntity.badRequest().body(bindingResult.getAllErrors());
		}
		
		Map<String, String> response = tarefaService.criarNovaTarefa(tarefaDTO);
		
		return ResponseEntity.status(HttpStatus.CREATED).contentType(MediaType.APPLICATION_JSON).body(response);
	}
	
}