
package desafios1;

public class Teste2 {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);

		 double N, i, soma = 0.0, media ;
		 int c = 0;
 

		 for (i = 0; i < 6; i++) {
		 System.out.println("Numero: ");
			 N = scan.nextDouble();
		  	if (N > 0.0) {
		  		c++;
		  		soma = soma + N;
		  	}
		 }

		 media = soma/c;
		 System.out.println(c + " valores positivos");
		 System.out.println(media);
	}

}
