package br.com.fernandes.service;

import java.util.Collection;
import java.util.Map;

import br.com.fernandes.entity.Tarefa;
import br.com.fernandes.models.dto.TarefaDTO;

public interface TarefaService {
	public abstract Collection<Tarefa> listaTodasTarefas();
	public abstract Map<String, String> criarNovaTarefa(TarefaDTO tarefaDTO);
	public abstract void deletarTodasTarefas();
	public abstract void listaTarefaPorId(Long id);
	public abstract void atualizaTarefa(Tarefa tarefa);
	public abstract void atualizaTarefaPropriedade(Tarefa tarefa);
	public abstract void deletaTarefaPorId(Long id);
}