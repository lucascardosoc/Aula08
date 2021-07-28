import java.util.Scanner;

public class Desafio03 {
	/*Você deve se lembrar que os triângulos possuem uma regra para existirem: a soma de QUAISQUER dois lados tem que ser maior do que o lado restante.
E deve se lembrar, também, que os triângulos podem ser de três tipos: equiláteros, escalenos ou isósceles.
Crie uma função que valida se um triângulo existe ou não. Além disso, crie uma função que verifica o tipo do triângulo (ela deve primeiro validar se o triângulo existe).
A main do seu programa deve ter a leitura dos lados do triângulo e a chamada da função que retorna o tipo dele. 

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
				return "Triângulo equilátero";
			}else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
				return "Triângulo Isósceles";
			}else {
				return "Triângulo escaleno";
			}
		}
		return "Os lados informados não formam um triângulo";
	}
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double a, b, c;
		System.out.println("Digite um lado do triângulo");
		a=leitor.nextDouble();
		System.out.println("Dgite o segundo lado do triângulo");
		b=leitor.nextDouble();
		System.out.println("Digite o terceiro lado do triângulo");
		c=leitor.nextDouble();
		
		System.out.println(tipoTriangulo(a, b, c));
		leitor.close();
	}
}
