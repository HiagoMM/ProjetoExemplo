package br.unifacisa.treinamento.si;

import java.util.Calendar;
import java.util.Date;


public class Matricula {
	
	private static final Long PRIMEIRO_NUMERO = 1L; 
	private static final Long QUANTIDADE_DE_DIGITOS = 7L;
	private static Long numeroDaVez = PRIMEIRO_NUMERO ;
	
	
	public String toString() {
		return getMatriculaDaVez();
	}
	
	private static String getMatriculaDaVez() {
		
		
		Calendar calendario = Calendar.getInstance();
		Date date = new Date();
		calendario.setTime(date);
		
		Long quantidade =(QUANTIDADE_DE_DIGITOS - Long.toString(numeroDaVez).length());
	    String qtdZeros = "";
		for ( int i = 0; i < quantidade;i++) {
			qtdZeros += "0";
	    }
		String matricula = Long.toString(calendario.getWeekYear()) + qtdZeros + Long.toString(numeroDaVez);
		atualizaNumeroDaVez();
		return matricula;
		
	}
	private static void atualizaNumeroDaVez() {
		numeroDaVez++;
	}
	
	
	
}
