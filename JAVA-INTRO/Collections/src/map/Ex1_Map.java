package map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/*
Dada a população estimada de alguns estados do nordeste brasileiro, faça:
 Estado = PE - população = 9.616.621
 Estado = AL - população = 3.351.543
 Estado = CE - população  = 9.187.103
 Estado = RN - população = 3.534.265
 */
public class Ex1_Map {

	public static void main(String[] args) {
        System.out.println("Crie um dicionário que relacione os estados e suas respectivas populações: ");
		Map<String, Integer> estadosBrasileiros = new HashMap<>() {{
			put("PE", 9616621); 
			put("AL", 3351543);
			put("CE", 9187103);
			put("RN", 3534265);    
		}};

		System.out.println(estadosBrasileiros.toString());
        //System.out.println("Substitua a população do estado RN por : 3.534.165");
		estadosBrasileiros.put("RN", 3534165);
		System.out.println(estadosBrasileiros);
        System.out.println("Confira se o estado da Paraíba (PB) tucson está no dicionário, caso não, adicione " +"PB - 4.039.277: ");
        if(!estadosBrasileiros.containsKey("PB")) {
        	estadosBrasileiros.put("PB", 4039277);
        }
        System.out.println(estadosBrasileiros);
        
        System.out.println("Exiba a população do estado PE: " + estadosBrasileiros.get("PE"));
        
        System.out.println("Exiba todos os estados e suas populaçãos na ordem em que foram informados: ");
		Map<String, Integer> estadosBrasileiros1 = new LinkedHashMap<>() {{
			put("PE", 9616621); 
			put("AL", 3351543);
			put("CE", 9187103);
			put("RN", 3534265);    
		}};
		System.out.println(estadosBrasileiros1);

        System.out.println("Exiba todos os estados e suas populações na ordem alfabética: ");
        

        //System.out.println("Exiba o estado com o menor população (%s) e seu respectivo valor (%d)\n",

        //System.out.println("Exiba o estado com a maior população (%s) e seu respectivo valor (%d)\n",

        //System.out.println("Exiba a soma da população desses estados: ");


        //System.out.println("Exiba a média da população deste dicionário de estados: ");
        //System.out.println("Remova os estados com a população menor que 4.000.000: ");


        //System.out.println("Apague o dicionario de estados com suas respectivas populações estimadas: ");


        //System.out.println("Confira se a lista está vazia: ");
        
        
	}

}
