package desafioControleFluxo;

import java.util.Scanner;

public class Contador {
	
	public static void main(String[] args) {
		//cria objeto scanner
		Scanner terminalInput = new Scanner(System.in);
		
		System.out.println("Digite o primeiro parâmetro");		
		int parametroUm = terminalInput.nextInt();
		
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminalInput.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException e) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro"); 
		}
	}
	
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		
		 if (parametroUm >= parametroDois) {
	            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
	        }
		
		int contagem = parametroDois - parametroUm;
		//realizar o for para imprimir os números com base na variável contagem
		for (int i = parametroUm; i <= parametroDois; i++) {
            System.out.println(i);
        }
	}
}
