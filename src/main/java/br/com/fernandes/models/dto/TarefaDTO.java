package br.com.fernandes.models.dto;

import java.time.Instant;

import javax.validation.constraints.NotBlank;

import br.com.fernandes.models.enums.StatusEnum;


public class TarefaDTO {

	private Long id;
	
	@NotBlank(message="O campo 'titulo' é obrigatorio!")
	private String titulo;
	
	@NotBlank(message="O campo 'descricao' é obrigatorio!")
	private String descricao;
	
	private Instant dataDeCriacao = Instant.now();
	
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
	
	public TarefaDTO() {
		
	}
	
	public TarefaDTO(String titulo, String descricao) {
		this.titulo = titulo;
		this.descricao = descricao;
	}
}