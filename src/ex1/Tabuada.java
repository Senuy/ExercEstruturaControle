package ex1;

public class Tabuada {

	private int numero;

	public Tabuada(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void calcularTabuada() {
		System.out.println("A tabuada do Número " + getNumero() + " é :");
		for (int i = 1; i <= 10; i++) {
			System.out.println(getNumero() + " x " + i + " = " + getNumero() * i);
		}
	}
}
