package ExEstruturasDeRepeticao;

import java.util.Scanner;

public class Ex3_MaiorEMedia {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		int maior = 0;
		int soma = 0;
		
		int count = 0;
		do {
			System.out.print("Numero: ");
			numero = sc.nextInt();
			
			soma += numero;
			
			if (numero > maior)
				maior = numero;
			
			count += 1;
			
		} while(count < 5);
		
		System.out.println("Maior: " + maior);
		System.out.println("Média: " + soma / 5);
		
		sc.close();
		

	}

}
