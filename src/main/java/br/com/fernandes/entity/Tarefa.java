package br.com.fernandes.entity;

import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import br.com.fernandes.models.enums.StatusEnum;

@Entity
@Table(name= "tarefa")
public class Tarefa {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	private String titulo;
	@NotNull
	private String descricao;
	
	private Instant dataDeCriacao = Instant.now();
	
	@Enumerated(EnumType.STRING)
	private StatusEnum Status = StatusEnum.PENDENTE;
	
	private String Responsavel;
	
	private String[] Tags;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitulo() {
		return this.titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return this.descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Instant getDataDeCriacao() {
		return this.dataDeCriacao;
	}
	public void setDataDeCriacao(Instant dataDeCriacao) {
		this.dataDeCriacao = dataDeCriacao;
	}
	public StatusEnum getStatus() {
		return this.Status;
	}
	public void setStatus(StatusEnum status) {
		Status = status;
	}
	public String getResponsavel() {
		return this.Responsavel;
	}
	public void setResponsavel(String responsavel) {
		Responsavel = responsavel;
	}
	public String[] getTags() {
		return this.Tags;
	}
	public void setTags(String[] tags) {
		Tags = tags;
	}
	
	public Tarefa() {
		
	}
	
	public Tarefa(String titulo, String descricao) {
		this.titulo = titulo;
		this.descricao = descricao;
	}
}