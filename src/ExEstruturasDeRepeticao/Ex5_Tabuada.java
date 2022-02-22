package ExEstruturasDeRepeticao;

import java.util.Scanner;

public class Ex5_Tabuada {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Tabuada: ");
		int tabuada = sc.nextInt();
		
		System.out.println("\nTabuada do " + tabuada);
		for(int i = 0; i <= 10; i++) {
			
			System.out.println(tabuada + " x " + i + " = " + tabuada * i);
		}
		
		sc.close();
		
	}

}
