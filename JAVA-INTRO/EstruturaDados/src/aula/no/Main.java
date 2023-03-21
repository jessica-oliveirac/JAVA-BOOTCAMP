package aula.no;

public class Main {
//encadeamento de nó
	public static void main(String[] args) {
		No no1 = new No("Conteudo No1");

		No no2 = new No("Conteudo No2");
		no1.setProximo(no2);
		
		No no3 = new No("Conteudo No3");
		no2.setProximo(no3);
		
		No no4 = new No("Conteudo No4");
		no3.setProximo(no4);
		
		//no1->no2->no3->no4->null
		
		System.out.println(no1);
		System.out.println(no1.getProximoNo());
		System.out.println(no2);
		
		System.out.println("----------------");
		
		System.out.println(no1);
		System.out.println(no1.getProximoNo());
		System.out.println(no1.getProximoNo().getProximoNo());
		System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
		System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());

	}

}
