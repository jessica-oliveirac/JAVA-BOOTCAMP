package listas;


import java.util.LinkedList;

public class ExAula1 {

	public static void main(String[] args) {
        /*
        Para você: Resolva esses exercícios utilizando os métodos da implementação LinkedList:     
        */
		System.out.println("Crie uma lista chamada notas2 " +
                        "e coloque todos os elementos da list Arraylist nessa nova lista: ");
		LinkedList<Double> notas2  = new LinkedList<>();
		notas2.add(7d);
		notas2.add(8.5);
		notas2.add(9.3);
		notas2.add(5.0);
		notas2.add(7.0);
		notas2.add(0.0);
		notas2.add(3.6);
		System.out.println(notas2.toString());
		
		System.out.println("Mostre a primeira nota da nova lista sem removê-lo: " + notas2.get(0));
		
		System.out.println("Mostre a primeira nota da nova lista removendo-o: "+ notas2.get(0));
		notas2.remove(0);
		System.out.println(notas2);
	}	

}
