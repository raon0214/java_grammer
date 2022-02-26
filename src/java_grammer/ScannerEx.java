package java_grammer;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		//String str = sc.next();
		int[]array = new int[num];
		for(int i = 0; i<array.length; i++) {
			array[i] = sc.nextInt();
			
		}
		System.out.println(Arrays.toString(array));
			
		}

}
