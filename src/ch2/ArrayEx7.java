package ch2;

import java.util.Arrays;

public class ArrayEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArr = new int[5]; //int �迭�� ����
		//abc = new int [10]; ������ int�迭�� �ʱ�ȭ
		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = i;
		}
		System.out.println(Arrays.toString(numArr));
		for (int i = 0; i < numArr.length; i++) {
			int n = (int) (Math.random() * 5);
			int tmp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = tmp;
		}
		System.out.println(Arrays.toString(numArr));
  }
}
