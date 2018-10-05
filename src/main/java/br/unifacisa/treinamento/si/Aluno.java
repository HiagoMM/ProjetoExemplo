package br.unifacisa.treinamento.si;

public class Aluno {
	
	private static final Long PRIMEIRO_ID = 1L;
	private static Long idDaVez = PRIMEIRO_ID; 
	private Long id;
	private String nome;
	private Matricula matricula = new Matricula() ;
	private String curso;
	
	public String toString() {
		return this.nome;
	}
	
	public Aluno(String nome,String curso)
	{	this.nome = nome;
		this.curso = curso;
		this.id = idDaVez;
	
		idDaVez++;
	}
	
	public Matricula getMatricula() {
		return matricula;
	}


	public String getCurso() {
		return curso;
	}


	public void setCurso(String curso) {
		this.curso = curso;
	}


	public Long getId() {
		return id;
	}
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
	
	
	
	
}
