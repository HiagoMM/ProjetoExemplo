package br.unifacisa.treinamento.si;

public class App {
	public static void main(String[] args) {

		Aluno aluno = new Aluno("Hiago","SI");
		System.out.println(aluno.getMatricula());
		System.out.println(aluno.getId());
		Aluno aluno2 = new Aluno("Marcrids","Biologia");
		System.out.println(aluno2.getMatricula() );
		System.out.println(aluno2.getId());
		
		Turma turma = new Turma();
		turma.addAluno(aluno2);
		turma.addAluno(aluno);
		
		System.out.println(turma);
		turma.removerAluno(aluno2);
		System.out.println(turma);

	}
}
