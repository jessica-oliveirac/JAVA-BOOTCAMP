/* Faça um programa que leia um conjunto de dois valores, o primeiro representando o nome do aluno e 
 * o segundo a sua idade( pare o programa inserindo o valor 0 no nome).
 */
package loops;

import java.util.Scanner;

public class ex1_NomeIdade {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String nome;
		int idade;

		while(true) {
		System.out.print("Nome: ");
		nome = scan.next();
		if (nome.equals("0")) break;
		
		System.out.print("Idade: ");
		idade = scan.nextInt();
		}
		System.out.println("Continua aqui...");
		scan.close();
	}
	
}
