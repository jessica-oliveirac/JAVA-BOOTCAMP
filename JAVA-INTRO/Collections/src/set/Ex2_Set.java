package set;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

/*
Crie uma classe LinguagemFavorita que possua os atributos nome, anoDeCriacao e IDE.
Em seguida, crie um conjunto com 3 linguagens e faça um programa que ordene esse conjunto por:
a) Ordem de inserção;
b) Ordem natural(nome);
c) IDE;
d) Ano de criação e nome;
e) Nome, ano de criação e IDE;
Ao final, exiba as linguagens no console, um abaixo da outra.
*/
public class Ex2_Set {
	public static void main(String[] args) {
		Set<LinguagemFavorita> linguagem = new HashSet<>();
			linguagem.add(new LinguagemFavorita("Java", 1995,"Eclipse"));
			linguagem.add(new LinguagemFavorita("Python", 1991, "Pycharm"));
			linguagem.add(new LinguagemFavorita("c", 1972, "DEV"));


	
	System.out.println("--\tOrdem de inserção\t---");
	Set<LinguagemFavorita> linguagem1 = new LinkedHashSet<>(
			Arrays.asList(
		new LinguagemFavorita("Java", 1995,"Eclipse"),
		new LinguagemFavorita("Python", 1991, "Pycharm"),
		new LinguagemFavorita("c", 1972, "DEV")
		)
	);
	for(LinguagemFavorita linguagens: linguagem1) System.out.println(linguagens);
	
	System.out.println("--\tOrdem natural(nome)\t---");
	Set<LinguagemFavorita> linguagem2 = new TreeSet<>(linguagem);
    for (LinguagemFavorita linguagens : linguagem2) System.out.println(linguagens);

    //System.out.println("--\tIDE\t---");
    Set<LinguagemFavorita> linguagem3 = new TreeSet<LinguagemFavorita>(new ComparatorIde());
    linguagem3.addAll(linguagem);
    for (LinguagemFavorita linguagens : linguagem3) System.out.println(linguagens);

    System.out.println("--\tAno de criação e nome\t---");
    Set<LinguagemFavorita> linguagem4 = new TreeSet<LinguagemFavorita>(new ComparatorAnoDeCriacaoENome());
    linguagem4.addAll(linguagem);
    for (LinguagemFavorita linguagens : linguagem4) System.out.println(linguagens);

    //System.out.println("--\tNome, ano de criação e IDE\t---");
    Set<LinguagemFavorita> linguagem5 = new TreeSet<LinguagemFavorita>(new ComparatorNomeAnoDeCriacaoIde());
    linguagem5.addAll(linguagem3);
    for (LinguagemFavorita linguagens : linguagem5) System.out.println(linguagens);    
	}
}

class LinguagemFavorita implements Comparable<LinguagemFavorita>{
	public String nome;
	public Integer anoDeCriacao;
		public String ide;

	
	public LinguagemFavorita(String nome, Integer anoDeCriacao, String ide ) {

		this.nome = nome;
		this.anoDeCriacao = anoDeCriacao;
		this.ide = ide;
	}


	@Override
	public String toString() {
		return " [nome=" + nome + 
				", anoDeCriacao=" + anoDeCriacao + 
				", ide=" + ide + 
				"]";
	}


	@Override
	public int compareTo(LinguagemFavorita linguagemFavorita) {
        return this.nome.compareTo(linguagemFavorita.nome);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null ||getClass() != obj.getClass())return false;
		LinguagemFavorita other = (LinguagemFavorita) obj;
		return Objects.equals(nome, other.nome);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}
}

class ComparatorIde implements Comparator<LinguagemFavorita>{

	@Override
	public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        int anoDeCriacao = Integer.compare(l1.anoDeCriacao, l2.anoDeCriacao);
        if (anoDeCriacao != 0) return anoDeCriacao;
        return l1.nome.compareToIgnoreCase(l2.nome);
	}
}

class ComparatorAnoDeCriacaoENome implements Comparator<LinguagemFavorita>{

	@Override
	public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        int anoDeCriacao = Integer.compare(l1.anoDeCriacao, l2.anoDeCriacao);
        if (anoDeCriacao != 0) return anoDeCriacao;
        return l1.nome.compareToIgnoreCase(l2.nome);

	}
	
}

class ComparatorNomeAnoDeCriacaoIde implements Comparator<LinguagemFavorita>{

	@Override
	public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        int nome = l1.nome.compareToIgnoreCase(l2.nome);
        int anoDeCriacao = Integer.compare(l1.anoDeCriacao, l2.anoDeCriacao);
        if (nome != 0) return nome;
        if (anoDeCriacao != 0) return anoDeCriacao;
        return l1.ide.compareToIgnoreCase(l2.ide);
	}
	
}