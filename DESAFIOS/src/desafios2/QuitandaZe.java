package desafios2;

import java.util.*;
public class QuitandaZe {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//System.out.print("Morangos em kg: ");
	    int morangos = input.nextInt();
	    //System.out.print("Maçãs em kg: ");
	    int macas = input.nextInt();

	    double precoMorango, precoMaca, pesoTotal, valorTotal;
        if (morangos<=5){
            precoMorango = morangos*2.50;
          } else {
            precoMorango = morangos*2.20;
          }
  	
          if (macas<=5){
            precoMaca = macas*1.80;
          } else {
            precoMaca= macas *1.50;
          }
  	
  	      pesoTotal = macas+morangos;
  	      valorTotal = precoMorango +precoMaca;
  	
  	      if(pesoTotal>8 || valorTotal>25){
  	        valorTotal = valorTotal-(0.10*valorTotal);
  	      }
  	      System.out.print("Valor total: " + valorTotal);
	    input.close();
	}

}
