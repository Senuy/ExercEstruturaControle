package ex1;

public class Tabuada {
	
	private int Numero;

	public Tabuada(int numero) {
		super();
		Numero = numero;
	}

	public int getNumero() {
		return Numero;
	}

	public void setNumero(int numero) {
		Numero = numero;
	}
	
	public void calcularTabuada() {
		System.out.println("A tabuada do Número "+ getNumero() + " é :");
		for(int i = 1 ; i <=10 ;i++) {
			System.out.println(getNumero()+" x "+i+ " = "+ getNumero()*i );
		}
	}

}
