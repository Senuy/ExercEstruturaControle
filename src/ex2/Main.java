package ex2;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	int menu;
	Scanner scanner = new Scanner(System.in).useLocale(Locale.US); //locale para usar o sistema americano para pontuação na casa decimal
	
	while (true) {
		
		System.out.println("""
				Para calcular o IMC digite 1 
				Para sair digite 0
				""");
		try {
		menu = scanner.nextInt();
		
		switch (menu) {
		case 1:
			System.out.println("Digite sua altura: ");
			double altura = scanner.nextDouble();
			System.out.println("Digite seu peso: ");
			double peso = scanner.nextDouble();
			
			IMC imc = new IMC(altura, peso);
			
			imc.calcularIMC();
			
			break;

		case 0:

			scanner.close();
			return;
		default:
			
			System.out.println("Opçao inválida use 1 ou 0");
		}
		}catch(InputMismatchException e){
			System.out.println("Use ponto como separador da casa decimal");
		}
		
	}

	}

}
