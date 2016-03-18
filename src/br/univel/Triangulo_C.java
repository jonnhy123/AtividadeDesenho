package br.univel;

public class Triangulo_C implements Desenho {

	public static int SIZE = 10;
	public static int ALTURA = 10;
	
	@Override
	public void desenhar() {
		
		System.err.println("\nC)");
		
		int brancos = 0;
		
		for (int linha = 0; linha < SIZE; linha++) {
			for (int coluna = 0; coluna <= ALTURA; coluna++) {
				if (coluna > brancos) {
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			brancos++;
			System.out.print("\n");
		}
		
	}

}
