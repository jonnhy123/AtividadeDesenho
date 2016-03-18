package br.univel;

public class Triangulo_B implements Desenho {

	public static int SIZE = 10;
		
	@Override
	public void desenhar() {
		int aux = 10;
		
		System.err.println("\nB)");
		
		for (int linha = 0; linha < SIZE; linha++) {
			for (int coluna = 0; coluna < aux; coluna++) {
				System.out.print("*");
			}
			aux--;
			System.out.println();
		}
	}

}
