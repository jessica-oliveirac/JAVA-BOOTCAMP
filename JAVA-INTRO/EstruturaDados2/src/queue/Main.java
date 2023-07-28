package queue;

import java.util.LinkedList;
import java.util.Queue;
/*
Offer:Retorna falso se não conseguir executar
add:Dá erro se não conseguir executar

Peek: p
//Pega o elemento da cabeça(primeiro elemento) da fila e se tiver vazia retorna null
pull: pega e remove
*/
public class Main {

	public static void main(String[] args) {
        Queue<Carro> queueCarros = new LinkedList<Carro>();

        queueCarros.add(new Carro("Ford"));
        queueCarros.add(new Carro("Chevrolet"));
        queueCarros.add(new Carro("Fiat"));
        System.out.println(queueCarros.add(new Carro("Peugeot"))); //IllegalStateException
        System.out.println(queueCarros);


        System.out.println(queueCarros.offer(new Carro("Renault")));
        
        System.out.println(queueCarros.peek());
        System.out.println(queueCarros);
        
        System.out.println(queueCarros.poll()); //Remove ou retorna nulo para caso de fila vazia
        System.out.println(queueCarros);
        
        System.out.println(queueCarros.isEmpty());
        
        System.out.println(queueCarros.size());
        
        System.out.println(queueCarros.element());//Pega o elemento da cabeça da fila sem remover
        System.out.println(queueCarros);
        
        System.out.println(queueCarros.remove()); //Remove
        System.out.println(queueCarros);

	}

}
