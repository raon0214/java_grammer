package java_grammer;

import java.util.Arrays;
import java.util.Scanner;

public class ScaanerEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc;
		//new => 주솟값 생성
		sc = new Scanner(System.in);
		int num = sc.nextInt();
		String[]array = new String[num];
		for(int i = 0; i<array.length; i++) {
			array[i] = sc.next();	
		}
		
		System.out.println(Arrays.toString(array));
	}

}
