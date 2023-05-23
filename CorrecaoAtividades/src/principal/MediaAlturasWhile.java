package principal;

import java.util.Scanner;

public class MediaAlturasWhile {

		public static void Maw(){
			Scanner sc = new Scanner(System.in);
			double somaAltura = 0;
			double altura = 0;
			int contador = 0;
		
			while (contador < 5 ) {
			System.out.println("Insira a altura: ");
			altura = sc.nextDouble();
			somaAltura += altura;
			contador++;
			}
			
			System.out.println("A média das alturas é: "+ (somaAltura / contador));
			sc.close();
		}
}