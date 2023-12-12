package exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class exercicios1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String cor;
		Set<String> setCores = new HashSet<String>();
		
		for(int i = 1; i <= 5; i++) {
			System.out.println("Escreva uma cor");
			cor = scanner.nextLine();
			setCores.add(cor);	
			System.out.println("cores da lista: " + setCores);
		}
		
        List<String> listaCores = new ArrayList<>(setCores);// Transforma em uma lista para ordenar
        Collections.sort(listaCores);//Collections.sort() = Ordena em ordem alfabética

        System.out.println("\nCores da lista ordenadas: ");
        for (String corOrdenada : listaCores) {
            System.out.println(corOrdenada);
        }

		
	}

}
