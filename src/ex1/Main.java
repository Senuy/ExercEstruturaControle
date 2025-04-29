package ex1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i =1;
		int menu;
		
		while(i==1) {
			System.out.println("""
			Para calcular a tabuada digite -> 1
			Para sair digite -> 0
			""");
			menu = scanner.nextInt();
			
			switch (menu) {
			case 1: {
				System.out.println("Insira o número que deseja fazer a tabuada: ");
				int num = scanner.nextInt();
				Tabuada tabuada = new Tabuada(num);
				tabuada.tabuadaAte10();
				break;
			}
			
			case 0:{
				i=2;
				break;
			}
	
			}
			
			
		}
	}

}
