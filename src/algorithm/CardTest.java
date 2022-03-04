package algorithm;

public class CardTest {
	//Card test = new Card();
	TV tv = new TV();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("card.height = " + Card.height);
		System.out.println("card.width = " + Card.width );
		
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "spade";
		c2.number = 4;
		
		
		c1.width = 50;
		c1.height = 150;
		
		System.out.println("c1.kind = " + c1.kind);
		System.out.println("c1.number = " + c1.number);
		System.out.println("c1.width = " + c1.width);
		System.out.println("c1.height = " + c1.height);
		
		System.out.println("c2.kind = " + c1.kind);
		System.out.println("c2.number = " + c2.number);
		System.out.println("c2.width = " + c2.width);
		System.out.println("c2.height = " + c2.height);
	}
}


