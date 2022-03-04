package algorithm;

public class CallStackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("callStackTest.main-Start");
		firstMethod();
		System.out.println("callStackTest.main-end");
	}
	static void firstMethod() {
		System.out.println("callStackTest.firstMethod-start");
		secondMethod();
		System.out.println("callStackTest.firstMethod-End");
	}
	static void secondMethod() {
		System.out.println("callStackTest.second Method-start");
		System.out.println("callStackTest.second Method-end");
		
	}
	
}
