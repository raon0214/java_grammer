package ch2;

import java.util.Scanner;

public class Ex25 {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char ch =' ';
		 System.out.println("���ڸ� �ϳ� �Է��ϼ���");
		 String input = sc.nextLine();
		 ch = input.charAt(0);
		 
		 if('0'< ch && ch <='9') {
			 System.out.println("�Է��� ���ڴ� �����Դϴ�");
			 System.out.println(" ch = "+ ch);
		 }else if(('a'<= ch && ch <='z')) {
			 System.out.println("�Է��� ���ڴ� �ҹ����Դϴ�");
			 System.out.println("ch="+ ch);
		 }else if(('A'<= ch && ch <='Z')){
		System.out.println("�Է��� ���ڴ� �빮���Դϴ�");
		System.out.println("ch="+ ch);
		 }else{
			 System.out.println("ch="+ ch);
				
			 
		 }
		
	}
	

}
