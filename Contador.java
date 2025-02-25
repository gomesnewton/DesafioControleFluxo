import java.util.Scanner;

public class Contador {
	
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro: ");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro: ");
		int parametroDois = terminal.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);

		} catch (ParametrosInvalidosException ex) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
			System.out.println(ex.getMessage());
		}

		terminal.close();
	}


	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		int contagem = parametroDois - parametroUm;
		if (contagem < 0) throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro"); 
		//realizar o for para imprimir os números com base na variável contagem
		for (int i = 0; i <= contagem; i++) {
			System.out.printf("Imprimindo o número %d%n", i);
		}
	}
}


class ParametrosInvalidosException extends RuntimeException {
	
	public ParametrosInvalidosException(String errorMessage) {
		super(errorMessage);
	}
}
