package ExEstruturasDeRepeticao;

import java.util.Scanner;

public class Ex4_ParEImpar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int quantNumeros, numero;
		int quantImpares = 0, quantPares = 0;
		
		System.out.print("Quantidade de n�meros: ");
		quantNumeros = sc.nextInt();
		
		System.out.println();
		int count = 0;
		do {
			
			System.out.print("N�meros: ");
			numero = sc.nextInt();
			
			if(numero % 2 == 0)
				quantPares++;
			else
				quantImpares++;
			
			count++;
			
		} while(count < quantNumeros);
		
		System.out.println("\nQuantidade de N�meros Pares: " + quantPares);
		System.out.println("Quantidade de N�meros �mpares: " + quantImpares);
		
		
		sc.close();

	}

}
