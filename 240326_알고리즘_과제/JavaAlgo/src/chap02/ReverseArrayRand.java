package chap02;

import java.util.Random;
import java.util.Scanner;

public class ReverseArrayRand {

	public static void main(String[] args) {
		
		int num = getPositiveNumber("1부터 1000까지의 번호 수 : ");
		
		int[] numArr = new int[num + 1];
		
		getRandArray(numArr, 1, 1000);
		
		// 배열 역순 정렬
		reverseArray(numArr);
		
		// 배열 출력
		displayArray(numArr);

	}

	static int getPositiveNumber(String message) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		do {
			System.out.print(message);
			num = sc.nextInt();
		} while(num <= 0);
		
		return num;
		
	}
	
	static void getRandArray(int[] numArr, int start, int end) {
		Random rand = new Random();
		
		for (int i = 1; i < numArr.length; i++) {
			numArr[i] = rand.nextInt(end - start) + start;
			System.out.print(numArr[i] + " ");
		}		
		System.out.println();
	}
	
	
	static void reverseArray(int[] numArr) {
		for (int i = 0; i < numArr.length/2; i++) {
			swap(numArr, i, numArr.length - i - 1);
		}
		
	}
	
	static void swap(int[] numArr, int source, int target) {
		int temp = numArr[source];
		numArr[source] = numArr[target];
		numArr[target] = temp;
	}

	static void displayArray(int[] numArr) {
		for (int i = 0; i < numArr.length - 1; i++) {
			System.out.print(numArr[i] + " ");
		}
		System.out.println();
	}

}
