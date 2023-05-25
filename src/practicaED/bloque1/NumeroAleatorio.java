package practicaED.bloque1;

import java.util.Scanner;

public class NumeroAleatorio {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero1, numero2, numeroRandom;
		
		System.out.printf("Introduceme el primer número: ");
		numero1 = Integer.parseInt(teclado.nextLine());
		
		System.out.printf("Introduceme el segundo número: ");
		numero2 = Integer.parseInt(teclado.nextLine());
		
		System.out.printf("El número aleatorio es: ");
		for(int i = 1; i<=1; i++)
			System.out.println(numeroRandom = (int)(Math.random()*(numero1-numero2+1)+numero2));

		teclado.close();
	}

}
