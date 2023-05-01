package desafios2;

//import java.Exception;
import java.util.Scanner;

public class triangulo {
	//import java.IOException;
	//import java.util.Scanner;
 //
		public static void main(String[] args) throws Exception{
		    Scanner scan = new Scanner(System.in);
			
			float perimetro, area, L1, L2, L3;
			
			System.out.print("Lado A");
			L1 = scan.nextFloat();
			
			System.out.print("Lado B");
			L2 = scan.nextFloat();
			
			System.out.print("Lado C");
			L3 = scan.nextFloat();
			
			
			if(L1>L2+L3||L2>L1+L3 || L3>L1+L2) {
				perimetro = L1 + L2 + L3;
				System.out.print("Perimetro" + perimetro);
			} else {
				 area = ((L1 + L2) * L3) / 2;
				 System.out.print("Area: " + area);
			}
			
			scan.close();

		}
}

