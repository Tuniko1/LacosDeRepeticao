package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	
	
		Scanner sc = new Scanner(System.in);
		
		char opcao;
		
		do {
		System.out.println("Deseja iniciar o programa 1? -> Insira 's' para SIM" );
		opcao = sc.next().charAt(0);
			
		if(opcao=='s') {		
			Altura.Alt();	
			}
		
		System.out.println();
		System.out.println("Deseja iniciar o programa 2? Insira 's' para SIM");
		opcao = sc.next().charAt(0);
		
		if(opcao=='s') {		
		BlocoCondicao.condicao();	
		}  
		
		//Deseja iniciar o programa 3? Insira 's' para SIM"
		AlturaWhile.AltW();
		
		}while(opcao == 's'); {
			System.out.println("Deseja continuar? ");
			opcao = sc.next().charAt(0);
	
			sc.close();}}
}
