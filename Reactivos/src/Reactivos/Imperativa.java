package Reactivos;

import java.util.List;

public class Imperativa {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(25, 1, 12, 3, 54, 65, 8);
		
		int contador = 0;
		
		for(int number : numbers) {
			if(number>10) {
				contador++;
			}
		}
		
		System.out.println(contador);
	}

}