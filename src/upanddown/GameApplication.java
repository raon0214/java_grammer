package upanddown;

import java.util.Scanner;

public class GameApplication {
	/**
	 * UpAndDown Game 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc =  new Scanner(System.in);
		 int answer = (int)(Math.random()*100);
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

