package java_grammer;

public class For {
public static void main(String args[]) {
	// ������ Ƚ���� ���� ��� for ���
	for(int i = 0 ; i < 10; i++) {
		System.out.println("i�� �� = " + i);
		System.out.println("*******");
		printLine(i);
	}

}
public static void printLine(int value) {
	for(int j = 0; j < value; j++) {
		System.out.println("");//��������
	}
}

}
