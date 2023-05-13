package desafios3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Livraria {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DecimalFormat saida = new DecimalFormat("0.00");
		// Instancia 2 objetos do tipo "Livro" com os dados de entrada.
		Livro livro1 = new Livro(scanner.nextLine(), scanner.nextDouble(), scanner.nextInt());
		scanner.nextLine(); // Limpa o buffer do teclado
		Livro livro2 = new Livro(scanner.nextLine(), scanner.nextDouble(), scanner.nextInt());

		//TODO: Considerando os objetos "livro1" e "livro2", calcule o valor total da compra.
		double precoTotal = livro1.getPreco() +livro2.getPreco();

		//TODO: Considerando os objetos "livro1" e "livro2", calcule o número de livros comprados.
		int quantidadeTotal = livro1.getQuantidade()+ livro2.getQuantidade();

		//TODO: Imprima as linhas necessárias conforme a saída deste desafio.
		System.out.println("Valor total da compra: " + (saida.format(precoTotal)));
		System.out.println("Numero de livros comprados: " + quantidadeTotal);
		System.out.println("Obrigado por comprar na nossa livraria!");
		scanner.close();
	}

	static class Livro {
		String nome;
		double preco;
		int quantidade;
 
		Livro(String nome, double preco, int quantidade) {
			this.nome = nome;
			this.preco = preco;
			this.quantidade = quantidade;
		}
 
			public double getPreco() {
				return quantidade*preco;
			}

			public int getQuantidade() {
				return quantidade;
			}
	}
}