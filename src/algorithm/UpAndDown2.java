package algorithm;

import java.util.Scanner;

public class UpAndDown2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc =  new Scanner(System.in);
		 int answer = (int)(Math.random()*1000)+1;
		 //System.out.println("answer = " + answer);
		 int input = sc.nextInt();
		 while(input != answer) {
			if(input > answer) {
				System.out.println("Down");
			}
			else if(input < answer) {
				System.out.println("up");
				}	
			input = sc.nextInt();
	}

}
}