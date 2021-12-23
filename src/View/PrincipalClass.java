package View;

public class PrincipalClass {
	
	public static void main(String []args) {
		
		
		int a=78;
		int b=117;
		int r=1;
		
		
		
		do {
			
			
			r = a%b;
			a = b;
			b = r;
			
			
			
			
		}while (r>0);
		
		
		System.out.println("Valor= "+a);
		
		
	
	
		
		
	}

}
