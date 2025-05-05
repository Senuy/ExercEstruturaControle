package ex3;

public class Number {
	private int numero1;
	private int numero2;

	public Number(int numero1, int numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}

	public int getNumero1() {
		return numero1;
	}

	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}

	public int getNumero2() {
		return numero2;
	}

	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}

	public void impar() {
		System.out.println("Selecionado impar: ");
		for (; numero1 <= numero2; numero1++) {
			if (numero1 % 2 == 1) {
				System.out.print(numero1 + " ");
			}
		}
	}

	public void par() {
		System.out.println("Selecionado par: ");
		for (; numero1 <= numero2; numero1++) {
			if (numero1 % 2 == 0) {
				System.out.print(numero1 + " ");
			}
		}
	}

}
