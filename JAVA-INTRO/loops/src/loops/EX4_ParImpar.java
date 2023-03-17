/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/
package loops;

import java.util.Scanner;

public class EX4_ParImpar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int quantNumeros;
		int numero;
		int quantPares = 0, quantImpares = 0;
		
		System.out.print("Quantidade de numeros: ");
		quantNumeros = scan.nextInt();
		int count = 0;
		do {
			System.out.print("Numero: ");
			numero = scan.nextInt();
			
			if (numero % 2 == 0) quantPares++;
			else quantImpares++;
			count++;
		} while(count < quantNumeros);

		System.out.println("Quantidade Par: " + quantPares);
		System.out.println("Quantidade Impar: " + quantImpares);
		
	}

}
