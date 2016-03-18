package br.univel;
/**
 * Desenha a figura abaixo com largura = SIZE
 * 
 *	****
 *	*  *
 *	*  *	
 *	****
 */
public class Quadrado implements Desenho {
// 3 Commit na class Quadrado
	public static int SIZE = 8;
	
	@Override
	public void desenhar() {
		System.err.println("Desenhando Quadrado");
		
		for (int i = 0; i < SIZE; i++) {
			for (int x = 0; x < SIZE; x++) {
				if (i == 0 || i == SIZE - 1) {
					System.out.print("*");
				}else{
					if (x == 0 || x == SIZE - 1) {
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
				}
			}System.out.println();
		}
	}

}
