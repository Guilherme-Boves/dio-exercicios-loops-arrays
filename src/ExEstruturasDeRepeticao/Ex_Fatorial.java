package ExEstruturasDeRepeticao;

import java.util.Scanner;

public class Ex_Fatorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Fatorial: ");		
		int fatorial = sc.nextInt();
		
		int multiplicacao = 1;
		
		System.out.print(fatorial + "! = ");
		for(int i = fatorial; i >= 1; i--) {
			multiplicacao *= i;			
		}
		
		System.out.print(multiplicacao);
		
		sc.close();
		

	}

}
