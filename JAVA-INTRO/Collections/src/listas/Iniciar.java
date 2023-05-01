package listas;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Iniciar {

	public static void main(String[] args) {
//		List notas = new ArrayList();// antes do java 5
		
//		ArrayList<Double> notas = new Arraylist<>();// antes do java 5
//		List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));

//		List<Double> notas = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
//		notas.add(10d);
//		System.out.println(notas);
		
//		List<Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
//		notas.add(1d);
//		notas.remove(5d);
//		System.out.println(notas);
		
		System.out.println("Crie uma lista e adicione as setes notas: ");

		List<Double> notas = new ArrayList<>();//Generics(jdk 5)-Diamond Operator(jdk 7)
		notas.add(7d);
		notas.add(8.5);
		notas.add(9.3);
		notas.add(5.0);
		notas.add(7.0);
		notas.add(0.0);
		notas.add(3.6);
		System.out.println(notas.toString());
		//System.out.println(notas);
		System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d));
		
		System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
		notas.add(4, 8d);
		System.out.println(notas);
		
		System.out.println("Subistitua a nota 5.0 pela nota 6.0: ");
		notas.set(notas.indexOf(5d),6.0);
		System.out.println(notas);
		
		System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d));
		System.out.println("Exiba todas as notas na ordem em que foram informadas: ");
		for(Double nota : notas) System.out.println(nota);
		
		System.out.println("Exiba a terceira nota adicionada: ");
		System.out.println("Exiba a menor nota: ");
		System.out.println("Exiba a maior nota: ");
		System.out.println("Exiba a soma dos valores: ");

	}

}
