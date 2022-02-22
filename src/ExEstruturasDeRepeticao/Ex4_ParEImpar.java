package ExEstruturasDeRepeticao;

import java.util.Scanner;

public class Ex4_ParEImpar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int quantNumeros, numero;
		int quantImpares = 0, quantPares = 0;
		
		System.out.print("Quantidade de números: ");
		quantNumeros = sc.nextInt();
		
		System.out.println();
		int count = 0;
		do {
			
			System.out.print("Números: ");
			numero = sc.nextInt();
			
			if(numero % 2 == 0)
				quantPares++;
			else
				quantImpares++;
			
			count++;
			
		} while(count < quantNumeros);
		
		System.out.println("\nQuantidade de Números Pares: " + quantPares);
		System.out.println("Quantidade de Números Ímpares: " + quantImpares);
		
		
		sc.close();

	}

}
