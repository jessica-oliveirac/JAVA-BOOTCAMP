package desafios1;

import java.util.*;

public class FabricaCarro {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Custo de fábrica: ");
		int custoFabrica = scan.nextInt();
		
		System.out.print("Porcentagem do Distribuidor: ");
		int porcentagemDistribuidor = scan.nextInt();
		
		System.out.print("Percentual de impostos: ");
		int PercentualImpostos = scan.nextInt();
		
        int custoConsumidor;     
        int Distribuidor;
        int ValorImpostos;	
        // TODO: Implemente uma condição que calcule a porcentagem do distribuidor e dos impostos:
        
        Distribuidor = (custoFabrica * porcentagemDistribuidor) / 100;
        ValorImpostos = (custoFabrica * PercentualImpostos)/100;
        custoConsumidor = (custoFabrica + Distribuidor +ValorImpostos);
        
        System.out.println("Valor final: " + custoConsumidor);
		scan.close();
	}

}
