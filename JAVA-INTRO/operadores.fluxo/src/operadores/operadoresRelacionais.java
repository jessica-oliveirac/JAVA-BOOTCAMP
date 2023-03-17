package operadores;

public class operadoresRelacionais {

	public static void main(String[] args) {
		int i1 = 10;
		int i2 = 20;
		float f1 = 4.5f;
		float f2 = 3.5f;
		double d1 = 59.6d;
		char c1 = 'x';
		char c2 = 'y';
		String s1 = "Fulano";
		String s2 = "Fulano";
		String s3 = "Cicrano";
		boolean b1 = true;
		boolean b2 = false;
		
		long l1 = 1597L;
		long l2 = 8997L;
		byte y1 = 1;
		short h1 = 25;
		
		System.out.print("i1 == i2 " + (i1 == i2));
		System.out.print("\ni1 != i2 " + (i1 != i2));
		System.out.print("\ni1 > i2 " + (i1> i2));
		System.out.print("\ni1 <= i2 " + (i1 <= i2));
		
		System.out.print("\ni1 == i2 " + (f1 == f2));
		System.out.print("\ni1 != i2 " + (f1 != f2));
		System.out.print("\ni1 >= i2 " + (f1 >= f2));
		System.out.print("\ni1 < i2 " + (f1 < f2));
		
		System.out.print("\nc1 == c2 " + (c1 == c2));
		System.out.print("\nc1 != c2 " + (c1 != c2));
		System.out.print("\nc1 > c2 " + (c1 > c2));
		System.out.print("\nc1 <= c2 " + (c1 <= c2));
		
		System.out.print("\ns1 == s2 " + (s1 == s2));
		System.out.print("\ns1 == s3 " + (s1 == s3));
		System.out.print("\ns1 != s2 " + (s1 != s2));
		//System.out.print(s1 <= s2);
		//System.out.print((s1 < s2));
		
		System.out.print("\nb1 == b2 " + (b1 == b2));
		System.out.print("\nb1 != b2 " + (b1 != b2));	
		//System.out.print((b1 > b2));
		//System.out.print(b1 <= b2);
		
		System.out.print("\ni2 > f1 " + (i2 > f1));
		System.out.print("\nd1 == h1 " + (d1 == h1));	
		//System.out.print(s2 != c1);
		//System.out.print(s3 != i1);
		
		System.out.print("\nl1 == i2 " + (l1 == i2));
		System.out.print("\nl2 != i1 " + (l2 >= i1));	
		System.out.print("\ny1 != h1 " + (y1 != h1));
	}

}
