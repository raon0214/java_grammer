package java_grammer;

public class For {
public static void main(String args[]) {
	// 정해진 횟수가 있을 경우 for 사용
	for(int i = 0 ; i < 10; i++) {
		System.out.println("i의 값 = " + i);
		System.out.println("*******");
		printLine(i);
	}

}
public static void printLine(int value) {
	for(int j = 0; j < value; j++) {
		System.out.println("");//공백한줄
	}
}

}
