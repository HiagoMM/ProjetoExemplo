package br.unifacisa.treinamento.si;

public class Sala {
	
	
	private static final Long PRIMEIRO_ID = 1L;
	private static Long idDaVez = PRIMEIRO_ID; 
	private Long id;
	private Short capacidade;
	private Integer numero;
	private Boolean disponivel;
	
	
	public Sala (Integer numero,Short capacidade){
		this.disponivel = true;
		this.capacidade = capacidade;
		this.numero = numero;
		this.id = idDaVez;
		idDaVez++;
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
	public Long getId() {
		return id;
	}
	
	

}
