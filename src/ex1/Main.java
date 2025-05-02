package ex1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int i = 1;
		int menu;
		Scanner scanner = new Scanner(System.in);

		while (i == 1) {
			System.out.println("""
					Para calcular a tabuada de um número digite 1
					Para sair digite 0
					""");
			menu = scanner.nextInt();

			switch (menu) {
			case 1:
				System.out.println("Digite o número que deseja calcular a tabuada: ");
				int num = scanner.nextInt();

				Tabuada tabuada = new Tabuada(num);

				tabuada.calcularTabuada();

				break;

			case 0:
				i = 2;
				break;
			}

		}
	}
}
