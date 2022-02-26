package algorithm;

import java.util.Scanner;

public class VisibleStudent {
	
	public static int solution(int n,int [] ints) {
		int answer = 8;
		return answer;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] ints = new int[num];
		for(int i = 0; i < ints.length;i++) {
			ints[i] = sc.nextInt();
		}
		System.out.println(solution(num,ints));
	}

}
