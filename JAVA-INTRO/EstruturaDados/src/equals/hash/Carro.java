package equals.hash;

import java.util.Objects;

public class Carro {
	String marca;

	public Carro(String marca) {
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;//Se esse objeto é igual ao outro
		if (obj == null ||getClass() != obj.getClass())	return false;//Se o objeto é nulo ou são de classes diferentes
		Carro carro = (Carro) obj;// faz o cast do objeto que foi passado como parâmetro
		return Objects.equals(marca, carro.marca);// retorna se um é igual ao outro, levandoemconsideração o atributo marca
		//existem objetos que não são possíveis de ser comparados ==, então é preciso usar o equals
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(marca);//retorna um has gerado a partir do atributo marca
	}	
}
