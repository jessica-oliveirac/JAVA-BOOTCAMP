package desafios1;


import java.io.IOException;
import java.util.Scanner;

public class teste {
	
  public static void main(String[] args) throws IOException {
     Scanner leitor = new Scanner(System.in);
     int cont = 0;
     int valorPositivo = 0;
     double media = 0.0;
     double numero = 0.0;
     double soma = 0.0;

     //TODO: Implemente as condições adequadas para obter a quantidade 
    //de valores positivos e a média dos valores positivos:
        for (cont=1;cont<=6;cont++) {
        	System.out.println("Número: ");
        	numero = leitor.nextDouble();
        	
        	if (numero>0.0) {
        	  valorPositivo++;
          	soma = soma +  numero;
        	}
        	
        }
        
        media = soma/valorPositivo;
        System.out.println("Quantidade de valores positivos: " + valorPositivo);
        System.out.println(String.format("%.1f", media));
        //leitor.close();
    }
	
}