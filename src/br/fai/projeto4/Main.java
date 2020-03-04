package br.fai.projeto4;

public class Main {

	public static void main(String[] args) {
		
		Main app = new Main();
		app.start();
		
	}

	private void start() {
		
		int i = 0;
		int k = 0;
		int j = 0;
		
		
		while(i < 20) {
			i++;
			System.out.println("Valor de i:" + i);
		}
		
		do {
			k++;
			System.out.println("Valor de k: "+ k);
		}while(k < 20);
		
		
		for(j=1;j<=20;j++) {
			System.out.println("Valor de j: "+ j);
		}
	}

}

