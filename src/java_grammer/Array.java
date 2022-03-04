package java_grammer;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[] {1,2,3};
		printArray(a);
		printArray(new int[] {1,2,3});
		add(4,6);
   }
	
	public static void printArray (int[] a) {
		System.out.println(Arrays.toString(a));
	}
	
	static int add(int x , int y) {
		return x + y;
	}
}
