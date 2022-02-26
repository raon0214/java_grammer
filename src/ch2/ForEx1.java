package ch2;

public class ForEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] number = {1,2,3,4,5};
		int[] newArray = new int [10];
		for( int i = 0; i < number.length; i ++) {
			newArray [i] = number[i];
		}
		number = newArray;
	}
}

