package principal;

import java.util.Scanner;

public class AlturaWhile {

	public static void AltW() {
		
		//Faça um programa que leia a altura de 5 pessoas e mostre a media de altura entre elas;
		
		Double altura,altura2,altura3,altura4,altura5; 
		char opcao = 0;
		Scanner sc = new Scanner(System.in);
		

		
		System.out.println("Deseja iniciar o programa 3? Insira 's' para SIM?");
		opcao = sc.next().charAt(0);
		
		while (opcao=='s') {
			
			System.out.println();
			System.out.println("Deseja iniciar o programa média de altura com while? ");
			opcao = sc.next().charAt(0);
			if (opcao=='s') {
				
				System.out.println();
				System.out.println("Insira a altura da Pessoa 1:"); 
				altura = sc.nextDouble();
				
				System.out.println("Insira a altura da Pessoa 2:");
				altura2 = sc.nextDouble();
				
				System.out.println("Insira a altura da Pessoa 3:");
				altura3 = sc.nextDouble();
				
				System.out.println("Insira a altura da Pessoa 4:");
				altura4 = sc.nextDouble();
				
				System.out.println("Insira a altura da Pessoa 5:");
				altura5 = sc.nextDouble();
				
				double media = (altura + altura2 + altura3 + altura4 + altura5) / 5;
				
				System.out.println();
				System.out.println("a média dos valores é: "+media);	
			}
		}
	}	
}
