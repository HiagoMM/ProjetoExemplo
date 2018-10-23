package br.unifacisa.treinamento.si;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document
public class Aluno {
	
	@Id
	private String id;
	private String nome;
	private String matricula;
	private String curso;
	
	public String toString() {
		return this.nome;
	}

	public Aluno() 
	{	
		this.matricula = Matricula.getMatriculaDaVez();
		
	}
	
	public Aluno(String name,String curso)
	{	this.nome = name;
		this.curso = curso;
		this.matricula = Matricula.getMatriculaDaVez();
	}
	
	public String getMatricula() {
		return matricula;
	}


	public String getCurso() {
		return curso;
	}


	public void setCurso(String curso) {
		this.curso = curso;
	}


	public String getId() {
		return id;
	}
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
	
	
	
	
}
