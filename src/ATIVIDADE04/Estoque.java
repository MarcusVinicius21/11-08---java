package ATIVIDADE04;

import java.util.ArrayList;

public class Estoque {

	public static void main(String[] args) {
		String estoque1 = "Iphone";
		String estoque2 = "Samsung";
		String estoque3 = "Motorola";
		String estoque4 = "LG";
		String estoque5 = "Nokia";
		
		ArrayList<String> estoque = new ArrayList<>();
		estoque.add(estoque1);
		estoque.add(estoque2);
		estoque.add(estoque3);
		estoque.add(estoque4);
		
		System.out.println(estoque);
		
		estoque.add(estoque5);
		System.out.println(estoque);
		
		estoque.remove(0);
		System.out.println(estoque);
		
		for(String i: estoque) {
			System.out.println("Temos os celulares: " + i);
		}
		


	}

}
