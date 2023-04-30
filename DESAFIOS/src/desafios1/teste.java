package desafios1;


import java.io.IOException;
import java.util.Scanner;

public class teste {
	
  public static void main(String[] args) throws IOException {
	  Scanner leitor = new Scanner;
     int cont = 0;
     int valorPositivo = 0;
     double media = 0;
     double x ;
     double soma = 0.0;

     //TODO: Implemente as condições adequadas para obter a quantidade 
    //de valores positivos e a média dos valores positivos:
        while (cont<6) {
        	Scanner leitor = new Scanner(System.in);
      
        	x = new leitor.nextDouble();
        	
        	if (x>0) {
        	  double valoresPositivos =+ x;
        	}
        	cont++;
        }
        
        media = soma/valorPositivo;
        System.out.println("Quantidade de valores positivos: " + valorPositivo);
        System.out.println(String.format("%.1f", media));
    
    }
	
}