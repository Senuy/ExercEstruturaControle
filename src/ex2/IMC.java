package ex2;

public class IMC {

	private double altura;
	private double peso;
	private double imc;

	public IMC(double altura, double peso) {
		this.altura = altura;
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public double getPeso() {
		return peso;
	}

	private void printarImc() {

		System.out.printf("Dados informados\n " + "Peso:  %.2f \n", getPeso());
		System.out.println(" Altura: " + getAltura());
		System.out.printf("O IMC = %.2f\n" , imc);
	}

	public void calcularIMC() {
		imc = getPeso() / (getAltura() * getAltura());

		if (imc <= 18.5) {
			printarImc();
			System.out.println("Abaixo do Peso");
		} else if (imc <= 24.9) {
			printarImc();
			System.out.println("Peso ideal");

		} else if (imc <= 29.9) {
			printarImc();
			System.out.println("Levemente acima do peso");

		} else if (imc <= 34.9) {
			printarImc();
			System.out.println("Obesidade Grau I");

		} else if (imc <= 39.9) {
			printarImc();
			System.out.println("Obesidade Grau II (Severa)");

		} else if (imc >= 40) {
			printarImc();
			System.out.println("Obesidade Grau III(Mórbida)");
		}

	}

}
