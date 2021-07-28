import java.util.Scanner;

public class Desafio04 {
	/* 
	Considere o cálculo do salário de um professor, disponível em http://www1.sinprosp.org.br/guia_consultas.asp?mat=8
	
	Crie as funções que julgar necessárias para obter cada um dos valores que fazem parte do salário de um professor
	 * */
	
	public static double salarioBase(int numeroAulas, double horaAula) {
		return numeroAulas * 4.5 * horaAula;
	}
	
	public static double horaAtividade(double salarioBase) {
		return salarioBase*0.05;
	}
	
	public static double descansoSemanalRemunerado(double salarioBase, double horaAtividade) {
		return (salarioBase + horaAtividade) / 6;
	}
	
	public static double salarioBruto(double salarioBase, double horaAtividade, double DSR) {
		return (salarioBase + horaAtividade + DSR);
	}
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int nAulas;
		double vHAula;
		double SB, HA, DSR, salBruto;
		System.out.println("Informe a quantidade de aulas do professor");
		nAulas=leitor.nextInt();
		System.out.println("Informe o valor da hora aula do professor");
		vHAula=leitor.nextDouble();
		SB = salarioBase(nAulas, vHAula);
		HA = horaAtividade(SB);
		DSR = descansoSemanalRemunerado(SB, HA);
		salBruto = salarioBruto(SB, HA, DSR); 
		
		
		System.out.println("O salário do professor está composto da seguinte forma:");
		System.out.println("Salário base R$" + SB);
		System.out.println("Hora-atividade R$" + HA);
		System.out.println("DSR R$" + DSR);
		System.out.println("Salário total R$" + salBruto);
		
		leitor.close();
	}
}
