package desafios3;

import java.text.DecimalFormat;
import java.util.Scanner;
public class IdadePlanetaria {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    DecimalFormat saida = new DecimalFormat("0.00");
	    double idadeTerrestre = scanner.nextDouble();
	    String planeta = scanner.next();
	    
	    double idade=0;
	    switch(planeta){
	        case "Marte":
	          idade = idadeTerrestre/1.88;
	          System.out.println("Idade equivalente em "+ planeta + ": " + saida.format(idade) + " anos");
	          break;
	        case "Venus":
	            idade = idadeTerrestre/0.62;
	            System.out.println("Idade equivalente em "+ planeta + ": " + saida.format(idade) + " anos");
	            break;
	        case "Jupiter":
	            idade = idadeTerrestre/11.86;
	            System.out.println("Idade equivalente em "+ planeta + ": " + saida.format(idade) + " anos");
	            break;
	        default :
	           System.out.println("Planeta invalido."); 
	           break;
	    }
	    scanner.close();
	}

}
