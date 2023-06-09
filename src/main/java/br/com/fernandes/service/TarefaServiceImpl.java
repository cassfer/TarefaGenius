package br.com.fernandes.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.modelmapper.ModelMapper;

import br.com.fernandes.entity.Tarefa;
import br.com.fernandes.models.dto.TarefaDTO;
import br.com.fernandes.repository.TarefasRepository;

@Service
public class TarefaServiceImpl implements TarefaService {
	
	@Autowired
	private TarefasRepository tarefaRepository;
	
	
	@Override
	public Collection<Tarefa> listaTodasTarefas() {
		return tarefaRepository.findAll();
	}

	@Override
	public Map<String, String> criarNovaTarefa(TarefaDTO tarefaDto) {
		ModelMapper modelMapper = new ModelMapper();
		Tarefa tarefa = modelMapper.map(tarefaDto, Tarefa.class);
		tarefaRepository.save(tarefa);
		
		Map<String, String> response = new HashMap<>();
		response.put("mensagem", "Tarefa foi criada com sucesso!");
		return response;
	}

	@Override
	public void deletarTodasTarefas() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listaTarefaPorId(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizaTarefa(Tarefa tarefa) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizaTarefaPropriedade(Tarefa tarefa) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletaTarefaPorId(Long id) {
		// TODO Auto-generated method stub
		
	}

}