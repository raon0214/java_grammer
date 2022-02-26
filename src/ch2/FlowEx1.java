package ch2;

public class FlowEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int X = 0;
		System.out.printf("x=%d 일때, 참인것은 \n",X);
		if(X == 0) {
		System.out.println("x!=0");	
		}
		if(!(X == 0)) {
			System.out.printf("!(x == 0)");
		}
		if(!(X != 0)) {
		System.out.printf("!(x !=0)");	
		}
		
		X = 1;
		System.out.printf("x = %d 일떄,참인것은 \n",X);
		if (X == 0) System.out.println("x==0");
		
		if (X != 0) System.out.println("x!=0");
		
		if(!(X == 0)) System.out.println("!( x == 0)");
		
		if (!(X != 0)) System.out.println("!(x !=0')");		
	}

}
