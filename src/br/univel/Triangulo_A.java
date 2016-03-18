package br.univel;

public class Triangulo_A implements Desenho {

	private static int SIZE = 10;

	@Override
	public void desenhar() {
	int aux = 1;
	
	System.err.println("\nA)");
	
		for (int linha = 0; linha < SIZE; linha++) {
			for (int coluna = 0; coluna < aux; coluna++) {
					System.out.print("*");
			}
				aux++;
				System.out.println();
		}
	}
}
