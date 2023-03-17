package loops;

import java.util.Scanner;

public class maiorMedia {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numero;
		int maior = 0;
		int soma = 0;
		int media;
		
		int count = 0;
		do {
			System.out.println("Numero: ");
			numero = scan.nextInt();
			
			soma =  soma + numero;
			if(numero > maior) maior = numero;
			
			count = count + 1;
		} while(count < 5);
		
		media = soma/5;
		System.out.print("Maior: " + maior);
		System.out.println("\nMedia: " + media);
	}

}
