package desafios3;

import java.util.Scanner;

public class Loja {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    double media = scanner.nextDouble();
	    //TODO: Verifique a média lida e imprima a avaliação do funcionário.
	    //Onde: "APR" é bom, "MED" é médio e "REP" é ruim.
	    
	    	if(media<5){
	    		System.out.println("REP");
	    	} else if(media<7 && media>=5) {
	    		System.out.println("MED");
	    	} else if(media>=7){
	    		System.out.println("APR");
	    	}
	    scanner.close();
	}

}
