package java_grammer;

public class InternalCAllMethod2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print();
		
		int a = twice(3);
		System.out.println(a);
		
		double b = sum(a,5.8);
		System.out.println(b);
	}

		public static void print() {
			System.out.println("�ȳ�");	
		}
		public static int twice(int k) {
			return k * 2;
		}
		 public static double sum(int m, double n) {	
			 return m+n;
		 }
}
