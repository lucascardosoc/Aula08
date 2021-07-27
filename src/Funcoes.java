
public class Funcoes {
	
	public static boolean login(String user, String password) {
		if (user.equalsIgnoreCase("COMPRADOR") && password.equals("123")) {
			return true;
		}
		return false;
	}
	
	public static double somarCarrinho(double[] produtos) {
		double soma = 0;
		for(int i=0; i<produtos.length;i++) {
			soma = soma + produtos[i];
		}
		return soma;
		//System.out.println("O total do carrinho é R$" + soma);
	}
	
	public static void exibirMenu() {
		System.out.println("FIAP STORE! A LOJA DOS FIAPERS!");
		System.out.println("1 - Informar todos os valores do carrinho");
		System.out.println("2 - Exibir total do carrinho");
		System.out.println("3 - Sair");
	}

}
