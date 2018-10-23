package br.unifacisa.treinamento.si;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Sala {
	
	@Id
	private String id;
	private Short capacidade;
	private Integer numero;
	private Boolean disponivel;
	
	
	public Sala (Integer numero,Short capacidade){
		this.disponivel = true;
		this.capacidade = capacidade;
		this.numero = numero;
	
	}
	
	public Short getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(Short capacidade) {
		this.capacidade = capacidade;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public Boolean getDisponivel() {
		return disponivel;
	}
	public void setDisponivel(Boolean disponivel) {
		this.disponivel = disponivel;
	}
	public String getId() {
		return id;
	}
	
	

}
