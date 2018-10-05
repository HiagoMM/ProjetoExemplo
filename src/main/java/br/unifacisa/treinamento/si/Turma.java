package br.unifacisa.treinamento.si;

import java.util.ArrayList;
import java.util.List;

public class Turma {
	
	private static final Long PRIMEIRO_ID = 1L;
	private static Long idDaVez = PRIMEIRO_ID; 
	private Long id;
	private Sala sala;
	private List<Aluno> alunos = new ArrayList<Aluno>();
	private Short periodo;
	
	
	public Turma() {
		this.id = idDaVez;
		idDaVez++;
	}
	
	public List<Aluno> getAlunos() {
		return alunos;
	}
	
	
	
	
	public void addAluno(Aluno aluno) {
		boolean existe = alunoExiste(aluno);
		if (!existe) {
			this.alunos.add(aluno);
		}
	}
	
	public void removerAluno(Aluno aluno) {
		for(int i = 0 ; i<alunos.size() ; i++) {
			if (alunos.get(i).equals(aluno)) {
				alunos.remove(i);
			}
		}	
	}
	
	
	
	
	public Long getId() {
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
	
	
	private boolean alunoExiste(Aluno aluno) {
		boolean existe = false;
		for (int i = 0; i < alunos.size(); i++) {
			if (alunos.get(i).equals(aluno)) {
				existe = true;
			}
		}
		return existe;
	}
	
	public String toString() {
		String nomes = "";
		for (Aluno aluno : alunos) {
			nomes += aluno+" "; 
		}
		return nomes;
	}
	
}
