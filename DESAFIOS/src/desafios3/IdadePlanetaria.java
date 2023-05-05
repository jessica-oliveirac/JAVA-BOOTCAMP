package desafios3;

import desafios1.Scanner;

public class IdadePlanetaria {

	public static void main(String[] args) {
	
	    Scanner ler = new Scanner(System.in);
	    
	    System.out.println("Idade terrestre: ");
	    double idadeTerrestre = ler.nextDouble();
	    System.out.println("Escolha um planeta: ");
	    String planeta =ler.next();

	    //TODO: Crie as condições para calcular a idade equivalente de cada planeta.

	    //TODO: Imprima a saída conforme descrito neste desafio.
		
	    double idadeJupiter, idadeVenus, idadeMarte;
	    
	    if(planeta == "Marte"){
			    idadeMarte = idadeTerrestre/1.88;
			    System.out.println("Idade equivalente em Marte: %.2f" + idadeMarte + " anos");
			}else if(planeta == "Venus"){
			    idadeVenus = idadeTerrestre/0.62;
			    System.out.println("Idade equivalente em Venus: %.2f" +idadeVenus +" anos");
			}else if(planeta == "Jupiter"){
				idadeJupiter = idadeTerrestre/11.86;
			    System.out.println("Idade equivalente em Jupiter: %.2f"+ idadeJupiter + " anos");
			}else{
			  System.out.println("Planeta invalido");
			}
	    ler.close();
	}

}
