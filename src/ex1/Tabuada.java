package ex1;

public class Tabuada {
	
	public int num;

	public Tabuada(int num) {
		this.num = num;
	}

	public int getNum() {
		return num;
	}
	
	public void tabuadaAte10 () {
		for(int i =1; i<=10; i++) {
			System.out.println(num + "x" + i + "= "+ num*i);
		}
	}
	

}
