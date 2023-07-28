package map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/*Dadas as seguintes informações  de id e contato, crie um dicionário e
ordene este dicionário exibindo (Nome id - Nome contato);

id = 1 - Contato = nome: Simba, numero: 2222;
id = 4 - Contato = nome: Cami, numero: 5555;
id = 3 - Contato = nome: Jon, numero: 1111;
*/
public class Ex3_Map {

	public static void main(String[] args) {
		Map<Integer, Contato> meusContatos = new HashMap<>() {{
			put(1, new Contato("Simba",2222));
			put(4, new Contato("Cami",5555));
			put(3, new Contato("Jon",1111));
		}};
		System.out.println(meusContatos);
        for (Map.Entry<Integer, Contato> entry: meusContatos.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }
        
		//System.out.println("--\tOrdem Inserção\t--");
		Map<Integer, Contato> meusContatos1 = new LinkedHashMap<>() {{
			put(1, new Contato("Simba",2222));
			put(4, new Contato("Cami",5555));
			put(3, new Contato("Jon",1111));
		}};
		System.out.println(meusContatos1);
        for (Map.Entry<Integer, Contato> entry: meusContatos1.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }
        
		//System.out.println("--\tOrdem id\t--");
		//System.out.println("--\tOrdem número telefone\t--");
		//System.out.println("--\tOrdem nome contato\t--");
	}

}

class Contato  {

	String nome;
	Integer numero;	
	
	public Contato(String nome, Integer numero) {
		super();
		this.nome = nome;
		this.numero = numero;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getNumero() {
		return numero;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;
		Contato contato = (Contato) obj;
		return nome.equals(contato.nome) && numero.equals(contato.numero);
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, numero);
	}

		
	@Override
	public String toString() {
		return " [nome=" + nome + ", numero=" + numero + "]";
	}

	
}