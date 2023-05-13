package desafios3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Irlanda {

	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    DecimalFormat saida = new DecimalFormat("0.00");

	    // Leitura do salário e dos benefícios
	    double salarioBruto = input.nextDouble();
	    double beneficios = input.nextDouble();
	    
	    double imposto = 0;
	    //TODO: Implemente as regras para o cálculo do imposto.
	    if(salarioBruto<=1100) {
				imposto = 0.05*salarioBruto;
			}else if(salarioBruto>=1100.01 && salarioBruto<=2500){
				imposto = 0.10*salarioBruto;
			}else if(salarioBruto>2500) {
				imposto = 0.15*salarioBruto;
			}
	    // Cálculo do salário líquido
	    double salarioLiquido = salarioBruto - imposto + beneficios;
	    
	    //TODO: Imprimir o salário líquido com 2 casas decimais.
	        System.out.println(saida.format(salarioLiquido));
	       input.close();
	}

}
