package listas;

/*Dadas as seguintes informações sobre meus gatos, crie uma lista
e ordene esta lista exibindo:
(nome - idade - cor);
Gato 1 = nome: Jon, idade: 18, cor: preto
Gato 2 = nome: Simba, idade: 6, cor: tigrado
Gato 3 = nome: Jon, idade: 12, cor: amarelo
*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ordenar {
	public static void main(String[] args) {
		List<Gato> meusGatos = new ArrayList<Gato>() {{
			add(new Gato("Jon", 18, "preto"));
			add(new Gato("Simba", 6, "tigrado"));
			add(new Gato("Jon", 12, "amarelo"));
		}};
		System.out.println(meusGatos);
		
		System.out.println("--\tOrdem de Inserção\t---");
		System.out.println(meusGatos);
		
		System.out.println("--\tOrdem de aleatória\t---");
		Collections.shuffle(meusGatos);

		System.out.println("--\tOrdem de Natural (Nome)\t---");
		Collections.sort(meusGatos);
		System.out.println(meusGatos);
		
		System.out.println("--\tOrdem de Idade\t---");//usando o comparator, pois o comparable já foi sobrescrito
		//Collections.sort(meusGatos, new ComparatorIdade());
		meusGatos.sort(new ComparatorIdade());
		System.out.println(meusGatos);
		
		System.out.println("--\tOrdem de cor\t---");
		//Collections.sort(meusGatos, new ComparatorCor());
		meusGatos.sort(new ComparatorCor());
		System.out.println(meusGatos);
		
		System.out.println("--\tOrdem de Nome/Cor/Idade\t---");
		Collections.sort(meusGatos, new ComparatorCor());
		//meusGatos.sort(new ComparatorNomeCorIdade());
		System.out.println(meusGatos);
	}
}

	class Gato implements Comparable<Gato>{//comparados de acordo com os nomes dos gatos
		private String nome;
		private Integer idade;
		private String cor;


		Gato(String nome, Integer idade, String cor) {			
			this.nome = nome;
			this.idade = idade;
			this.cor = cor;
		}
		    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }
    
    @Override
    public String toString() {//se não sobrescrever o ToString, eler retorna o endereço de memória
        return "{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }
	@Override
	public int compareTo(Gato gato) {//comparar/ordenar através dos nomes dos gatos
		return this.getNome().compareToIgnoreCase(gato.getNome());// se utiliza o this por estar dentro da classe Gato
	}//método comparable: 0 nomes iguais, -1 nome anterior(menor), 1 nome sucessor(maior)
	//é preciso usar o comparable quando precisar ordenar na ordem natural
}

class ComparatorIdade implements Comparator<Gato> {

	@Override
	public int compare(Gato g1, Gato g2) {
		return Integer.compare(g1.getIdade(), g2.getIdade());
	}
	
}

class ComparatorCor implements Comparator<Gato> {

	@Override
	public int compare(Gato g1, Gato g2) {
		return g1.getCor().compareToIgnoreCase(g2.getCor());// Não se utiliza o this por estar fora da classe Gato. Usa  g1 e g2
	}
	
}

class ComparatorNomeCorIdade implements Comparator<Gato> {

	@Override
	public int compare(Gato g1, Gato g2) {
		int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
		if(nome != 0) return nome;

		int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
		if(cor != 0) return cor;
		
		return Integer.compare(g1.getIdade(), g2.getIdade());
	}
	
}
