package ex3;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

/*Escreva um código que o usuário entre com um primeiro número, um segundo número maior que o primeiro e escolhe 
 * entre a opção par e impar, com isso o código deve informar todos os números pares ou ímpares (de acordo com a seleção inicial)
 *  no intervalo de números informados, incluindo os números informados e em ordem decrescente;
*/
public class Main {

	static Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

	private static void exibirMenuENumeros(Number number, int num1, int num2, Scanner scaner) {
		boolean entradaValida = false;
		while (!entradaValida) {
			try {
				System.out.println("""
						Para selecionar impares digite 1
						Para selecionar pares digite 2
						""");
				int menu = scanner.nextInt();
				switch (menu) {
				case 1:
					System.out.println("Impares entre " + num1 + " e " + num2);
					number.impar();
					entradaValida = true;
					break;
				case 2:
					System.out.println("Pares entre " + num1 + " e " + num2);
					number.par();
					entradaValida = true;
					break;

				default:
					System.out.println("Digite 1 ou 2");
				}
			} catch (InputMismatchException e) {
				System.out.println("Digite um número válido");
				scaner.next();
			}
		}
	}

	public static void main(String[] args) {
		System.out.printf("Insira um número: ");
		int num1 = scanner.nextInt();
		System.out.printf("Insira o segundo maior que o primeiro  número: ");
		int num2 = scanner.nextInt();

		try {
			if (num1 > num2) {
				throw new FirstBiggerthanSecond(num1, num2);
			}
			Number number = new Number(num1, num2);
			exibirMenuENumeros(number, num1, num2, scanner);

		} catch (FirstBiggerthanSecond e) {

			System.out.println("O segundo número deve ser maior que o primeiro");
			System.out.printf("Digite o segundo número: ");
			num2 = scanner.nextInt();

			if (num2 > num1) {

				Number number = new Number(num1, num2);
				exibirMenuENumeros(number, num1, num2, scanner);

			} else {
				System.out.println("Segundo número ainda é menor ou igual o primeiro programa encerrado");
			}
		} finally {
			scanner.close();
		}
	}
}
