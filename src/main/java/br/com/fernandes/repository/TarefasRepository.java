package br.com.fernandes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fernandes.entity.Tarefa;


public interface TarefasRepository extends JpaRepository<Tarefa, Long> {
	
}