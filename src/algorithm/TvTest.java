package algorithm;

public class TvTest {
	int X = 5;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TvTest tvtest = new TvTest();
		System.out.println(tvtest.X);
		TvTest tvtest2 = new TvTest();
		System.out.println(tvtest2.X);

		TV t;
		t = new TV();
		t.channel = 12;
		t.setchannelDown();
		System.out.println("t.channel = " + t.channel);
	}

}
