package algorithm;

public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = {79,88,91,33,100,55,99};
		int max = score[0];
		int min = score[0];
		for(int i = 0 ; i < score.length; i++) {
			if(max < score[i]) {
				max = score[i];
			}
			if(min > score[i]) {
				min = score[i];
			}
		}
		System.out.println(max);
		System.out.println(min);

		
		}

}
