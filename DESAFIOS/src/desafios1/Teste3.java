package desafios1;

public class Teste3 {
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);

		 int valorPositivo = 0;
		 double media = 0.0;
		 Double numero[]= new Double [6];
		
		 for (int cont=0; cont<numero.length; cont++) {
			//System.out.print("Numero: ");
			numero[cont]=  scan.nextDouble();
			
				if (numero[cont]>0) {
					valorPositivo = valorPositivo+1;
					media =+ numero[cont];
				}	;
		 }
		 
		 media /= valorPositivo;
		 System.out.print(valorPositivo+ "valores positivos");
		 System.out.print(media);
		 scan.close();	
	}

}
