package Reactivos;

import java.util.List;

public class Declarativa {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(25, 1, 12, 3, 54, 65, 8);
		
		Long contador = numbers.stream().filter(num -> num >10).count();
		
		System.out.println(contador);
	}
}
