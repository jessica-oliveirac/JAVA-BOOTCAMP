package set;
		/*Dadas as seguintes informações sobre minhas séries favoritas,
		crie um conjunto e ordene este conjunto exibindo:
		(nome - genero - tempo de episódio);

		Série 1 = Nome: got, genero: fantasia, tempoEpisodio: 60
		Série 2 = nome: dark, genero: drama, tempoEpisodio: 60
		Série 3 = nome: that '70s show, genero: comédia, tempoEpisodio: 25
		*/
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class OrdenacaoSet {
	public static void main(String[] args) {
		
		System.out.println("--\tOrdem aleatória\t---");
		Set<Serie> minhasSeries = new HashSet<>() {{
			add(new Serie("got", "fantasia", 60));
			add(new Serie("dark", "drama", 60));
			add(new Serie("that '70s show", "comédia", 25));
		}};
		
		//foreach
		for(Serie serie: minhasSeries) System.out.println(serie.getNome() + "-" 
				+ serie.getGenero() + "-" + serie.getTempoEpisodio());
		
		System.out.println("--\tOrdem inserção\t---");
		Set<Serie> minhasSeries1 = new LinkedHashSet<>() {{
			add(new Serie("got", "fantasia", 60));
			add(new Serie("dark", "drama", 60));
			add(new Serie("that '70s show", "comédia", 25));
		}};
		
		for(Serie serie: minhasSeries1) System.out.println(serie.getNome() + "-" 
				+ serie.getGenero() + "-" + serie.getTempoEpisodio());
		
		System.out.println("--\tOrdem natural (TempoEpisodio)\t---");
		
//		System.out.println("--\tOrdem Nome/Gênero/TempoEpisodio\t---");		
//		System.out.println("--\tOrdem gênero\t---");
//		System.out.println("--\tOrdem Tempo Episódio\t---");
	}

}

class Serie {
	private String nome;
	private String genero;
	private Integer tempoEpisodio;
	
	public Serie(String nome, String genero, Integer tempoEpisodio) {
		this.nome = nome;
		this.genero = genero;
		this.tempoEpisodio = tempoEpisodio;
	}

	public String getNome() {
		return nome;
	}

	public String getGenero() {
		return genero;
	}

	public Integer getTempoEpisodio() {
		return tempoEpisodio;
	}

	@Override
	public String toString() {
		return "Serie [nome=" + nome + 
				", genero=" + genero + 
				", tempoEpisodio=" + tempoEpisodio + 
				"]";
	}


	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null|| getClass() != o.getClass()) return false;
		Serie serie = (Serie) o;
		return nome.equals(serie.nome) && genero.equals(serie.genero)
				&& tempoEpisodio.equals(serie.tempoEpisodio);
	}

	@Override
	public int hashCode() {
		return Objects.hash(genero, nome, tempoEpisodio);
	}
	
	
}

