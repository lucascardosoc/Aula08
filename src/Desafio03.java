import java.util.Scanner;

public class Desafio03 {
	/*Voc� deve se lembrar que os tri�ngulos possuem uma regra para existirem: a soma de QUAISQUER dois lados tem que ser maior do que o lado restante.
E deve se lembrar, tamb�m, que os tri�ngulos podem ser de tr�s tipos: equil�teros, escalenos ou is�sceles.
Crie uma fun��o que valida se um tri�ngulo existe ou n�o. Al�m disso, crie uma fun��o que verifica o tipo do tri�ngulo (ela deve primeiro validar se o tri�ngulo existe).
A main do seu programa deve ter a leitura dos lados do tri�ngulo e a chamada da fun��o que retorna o tipo dele. 

	 * */
	
	public static boolean existeTriangulo(double ladoA, double ladoB, double ladoC) {
		if (ladoA==0 || ladoB==0 || ladoC==0) {
			return false;
		}
		if ((ladoA + ladoB) > ladoC && (ladoB + ladoC) > ladoA && (ladoA + ladoC) > ladoB) {
			return true;
		}
		return false;
	}
	
	public static String tipoTriangulo(double ladoA, double ladoB, double ladoC) {
		if (existeTriangulo(ladoA, ladoB, ladoC)) {
			//Sei que existe e posso checar o tipo
			if (ladoA==ladoB && ladoA == ladoC) {
				return "Tri�ngulo equil�tero";
			}else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
				return "Tri�ngulo Is�sceles";
			}else {
				return "Tri�ngulo escaleno";
			}
		}
		return "Os lados informados n�o formam um tri�ngulo";
	}
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double a, b, c;
		System.out.println("Digite um lado do tri�ngulo");
		a=leitor.nextDouble();
		System.out.println("Dgite o segundo lado do tri�ngulo");
		b=leitor.nextDouble();
		System.out.println("Digite o terceiro lado do tri�ngulo");
		c=leitor.nextDouble();
		
		System.out.println(tipoTriangulo(a, b, c));
		leitor.close();
	}
}
