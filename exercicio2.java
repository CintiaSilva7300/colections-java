package exercicios;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numbers[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		int number;
		boolean notFound = false;
		
		System.out.println("Digite um numero para saber sua posição");
		number = scanner.nextInt();

		

		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] == number) {
				System.out.println("indice: " + i);
				 
				notFound = true;
	             break;
			}
		}
		if (!notFound) {
            System.out.println("Número não encontrado na lista.");
        }

	}
}
