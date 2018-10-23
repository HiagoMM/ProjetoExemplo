package br.unifacisa.treinamento.si;



import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Turma {
	
	@Id
	private String id;
	private Sala sala;
	@DBRef
	private List<Aluno> alunos = new ArrayList<Aluno>();
	private Short periodo;
	
	
	public Turma(Sala sala) {
		this.sala = sala;
	}
	
	public List<Aluno> getAlunos() {
		return alunos;
	}
	
	
	public String getId() {
		return id;
	}
	
	public Sala getSala() {
		return sala;
	}
	
	public void setSala(Sala sala) {
		this.sala = sala;
	}
	
	public Short getPeriodo() {
		return periodo;
	}
	
	public void setPeriodo(Short periodo) {
		this.periodo = periodo;
	}
	
	
	
	
	public String toString() {
		String nomes = "";
		for (Aluno aluno : alunos) {
			nomes += aluno+" "; 
		}
		return nomes;
	}
	
}
