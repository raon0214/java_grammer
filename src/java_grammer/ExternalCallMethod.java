package java_grammer;
class A{
	void print() {
		System.out.println("�ȳ�");
	}
	int data() {
		return 3;
	}
	double sum(int a,double b) {
		return a+b;
	}
	void printMonth(int m) {
		if(m < 0 || m > 12) {
			System.out.println("�߸����Է�");
			return;
		}
		System.out.println(m+"���Դϴ�");
	}
}
public class ExternalCallMethod {
	public static void main(String args[]) {
		A a = new A();
		a.print();
		int k = a.data();
		a.data();
		System.out.println(k);
		double result = a.sum(3,5.2);
		System.out.println(result);
		a.printMonth(5);
		a.printMonth(15);
	}
}
