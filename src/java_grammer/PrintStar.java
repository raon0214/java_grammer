package java_grammer;

public class PrintStar {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0 ; i <5 ; i++) {
			for(int j = 5;  j >= 0; j--) {
				if(i < j) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
	}	
}
	

	