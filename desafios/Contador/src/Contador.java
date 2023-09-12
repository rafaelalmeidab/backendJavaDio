import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (Exception e) {
			System.out.println("Something went wrong.");
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção

        if (parametroUm < 0 || parametroDois < 0 ) {
            throw new ParametrosInvalidosException("O parâmetro deve ser maior do que zero.");
        }
		if (parametroDois <= parametroUm) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior do que o primeiro parâmetro.");
        }

		int contagem = parametroDois - parametroUm;
		for(int i=1; i<=contagem; i++){
            System.out.println("Imprimindo o número " + i);
        }
	}
}