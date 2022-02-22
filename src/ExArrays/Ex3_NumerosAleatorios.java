package ExArrays;

import java.util.Random;
import java.util.Scanner;

public class Ex3_NumerosAleatorios {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Random random = new Random();
		
		int[] numerosAleatorios = new int[20];
		
		for(int i = 0; i < numerosAleatorios.length; i++) {
			int numero = random.nextInt(100);
			numerosAleatorios[i] = numero;
		}
		
		System.out.print("\nN�meros Aleat�rios: ");
		for (int numero : numerosAleatorios) {
			System.out.print(numero + " ");
		}

		System.out.print("\nSucessores dos N�meros Aleat�rios: ");
		for (int numero : numerosAleatorios) {
			System.out.print((numero+1) + " ");
		}
		
		sc.close();
		
	}

}
