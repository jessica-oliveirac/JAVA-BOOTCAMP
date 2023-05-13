package desafios3;

import desafios1.Scanner;

public class Trafego2 {

	public static void main(String[] args) {

			Scanner scan = new Scanner(System.in);
			int numero=0;
			System.out.println("Sinal: ");
		    numero = scan.nextInt();
		    

		    //TODO: Crie as condições necessárias para imprimir cada uma das possíveis saídas.
		        switch(numero){
		        case 1:
		        	System.out.println("Pare! O sinal está vermelho.");
		        	break;
		        case 2:
		        	System.out.println("Atenção! O sinal está amarelo.");
		        	break;
		        case 3:
		        	System.out.println("Siga em frente! O sinal está verde.");
		        	break;
		        default:
		          System.out.println("Valor inválido! Digite 1, 2 ou 3 para indicar a cor do semáforo.");
		          	break;
			    };
			    scan.close();
		    
	}

}
