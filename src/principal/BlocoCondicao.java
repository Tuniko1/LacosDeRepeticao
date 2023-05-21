package principal;

import java.util.Scanner;

public class BlocoCondicao {
	
		public static void condicao() {
			Scanner sc = new Scanner(System.in);
		
			int k = 1;
			int opcao = 1;
			System.out.println("Programa 2 - Bloco de Condição");
			System.out.println();
			
			do {
				System.out.println("Deseja continuar? Insira 1 para sim ");
				opcao = sc.nextInt();
				k++;
				
				if(opcao != 1 || opcao == 0){
					System.out.println("Entrou no bloco de condição: "+k+" vezes");					
				}
			}while(opcao == 1); {
				System.out.println();
				System.out.println("Deseja continuar?");
				opcao = sc.next().charAt(0);
				
			} 
	}
}
