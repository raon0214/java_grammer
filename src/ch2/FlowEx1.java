package ch2;

public class FlowEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int X = 0;
		System.out.printf("x=%d �϶�, ���ΰ��� \n",X);
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
		System.out.printf("x = %d �ϋ�,���ΰ��� \n",X);
		if (X == 0) System.out.println("x==0");
		
		if (X != 0) System.out.println("x!=0");
		
		if(!(X == 0)) System.out.println("!( x == 0)");
		
		if (!(X != 0)) System.out.println("!(x !=0')");		
	}

}
