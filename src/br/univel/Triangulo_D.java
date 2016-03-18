package br.univel;
//8 Commit na class Triangulo_D
public class Triangulo_D implements Desenho {

	public static int SIZE = 10;
	public static int ALTURA = 10;
	
	@Override
	public void desenhar() {
		
		System.err.println("\nD)");
		
		int brancos = 9;
		
		for (int linha = 0; linha < SIZE; linha++) {
			for (int coluna = 0; coluna <= ALTURA; coluna++) {
				if (coluna > brancos) {
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			brancos--;
			System.out.println();
		}
		
	}

}
