package set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/*
Crie uma conjunto contendo as cores do arco-íris e:
a) Exiba todas as cores o arco-íris uma abaixo da outra;
b) A quantidade de cores que o arco-íris tem;
c) Exiba as cores em ordem alfabética;
d) Exiba as cores na ordem inversa da que foi informada;
e) Exiba todas as cores que começam com a letra ”v”;
f) Remova todas as cores que não começam com a letra “v”;
g) Limpe o conjunto;
h) Confira se o conjunto está vazio;
 */
public class Ex1_Set {

	public static void main(String[] args) {
		System.out.println("Crie um conjunto contendo as cores do arco-íris: ");
		Set<String> cores = new HashSet<>();
		cores.add("vermelho");
		cores.add("laranja");
		cores.add("amarelo");
		cores.add("verde");
		cores.add("azul");
		cores.add("anil");
		cores.add("violeta");
		System.out.println(cores.toString());
		
		
		System.out.println("Exiba todas as cores o arco-íris uma abaixo da outra: ");
		
        for (String cor : cores) {
            System.out.println(cor);
        }
        
		System.out.println("Quantidade de cores que o arco-íris: " + cores.size());
		
		System.out.println("Exiba as cores em ordem alfabética");
		Set<String> cores2 = new TreeSet<>(cores);
		System.out.println(cores2);
		
		System.out.println("Exiba as cores na ordem inversa da que foi informada: ");
		Set<String> cores3 = new LinkedHashSet<>(Arrays.asList("vermelho", "laranja", "amarelo", "verde", "azul", "anil", "violeta"));
		System.out.println(cores3);
		List<String> coresList = new ArrayList<>(cores3);
		Collections.reverse(coresList);
		System.out.println(coresList);

		System.out.println("Exiba todas as cores que começam com a letra ”v”: ");
        for (String cor: cores) {
            if(cor.startsWith("v")) System.out.println(cor);
        }
        
		System.out.println("Remova todas as cores que não começam com a letra “v”: ");
        Iterator<String> iterator1 = cores.iterator();
        while(iterator1.hasNext()) { 
            if (!iterator1.next().startsWith("v")) iterator1.remove();
        }
        System.out.println(cores);
        
		System.out.println("Limpe o conjunto");
		cores.clear();
		System.out.println("Confira se o conjunto está vazio: " + cores.isEmpty());
		
	}

}
