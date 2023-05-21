package principal;

import java.util.Scanner;

public class Altura {
		
	public static void Alt(){

			double altura,altura2,altura3,altura4,altura5;
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Programa 1 - Cálculo da média de altura -->");
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
			System.out.println("a MÉDIA dos valores de altura é: "+media);	
	}
}
