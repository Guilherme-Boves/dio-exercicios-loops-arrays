package ExEstruturasDeRepeticao;

import java.util.Scanner;

public class Ex1_NomeEIdade {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("Nome: ");
			String nome = sc.next();	
			
			if(nome.equals("0")) {
				break;
			}
			
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			
		}
		
		System.out.println("Laço Encerrado");
		sc.close();

	}

}
