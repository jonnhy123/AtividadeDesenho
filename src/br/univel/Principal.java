package br.univel;
//Commit na Classe Principal
import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		List<Desenho> lista = new ArrayList<>();
		
		lista.add(new Quadrado());
		lista.add(new Triangulo_A());
		lista.add(new Triangulo_B());
		lista.add(new Triangulo_C());
		lista.add(new Triangulo_D());
		
		for (Desenho d : lista) {
			d.desenhar();
		}
		
//		Desenho q = new Quadrado();
//		Desenho p = new QuadradoProfessor();
//		Desenho a = new Triangulo_A();
//		Desenho b = new Triangulo_B();
//		Desenho c = new Triangulo_C();
//		Desenho d = new Triangulo_D();
//		d.desenhar();
	}

}
