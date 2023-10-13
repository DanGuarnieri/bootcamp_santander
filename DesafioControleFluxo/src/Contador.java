import java.util.Scanner;
import java.util.InputMismatchException;
public class Contador {
	public static void main(String[] args) throws ParametrosInvalidosException {
		try (Scanner terminal = new Scanner(System.in)) {
			System.out.println("Digite o primeiro parâmetro");
			int parametroUm = terminal.nextInt();
			System.out.println("Digite o segundo parâmetro");
			int parametroDois = terminal.nextInt();
			
try {
		contar(parametroUm, parametroDois);
	}
	catch (ParametrosInvalidosException e) 
	{
		System.err.println("Erro: " + e.getMessage());
	}
	} 
	catch (InputMismatchException e) 
	{
	System.err.println("Erro: Os parâmetros fornecidos não são números inteiros válidos.");
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if (parametroUm >= parametroDois)
		{
			throw new ParametrosInvalidosException();
		}
	
		int contagem = parametroDois - parametroUm;
		for (contagem = parametroUm; contagem <= parametroDois; contagem++) {
			System.out.println("Imprimindo o número " + contagem);
		//realizar o for para imprimir os números com base na variável contagem
	}
}}