package chap02;

import java.util.Random;
import java.util.Scanner;

public class MaxOfArrayRand {

	public static void main(String[] args) {
		// 사람 수 입력 받기
		int num = getPositiveNumber("사람 수 : ");
		
		// 사람 수만큼 random 생성하여 배열에 저장
		int[] height = new int[num];
		getRandArray(height, 100, 200);
		
		// 배열에서 가장 큰 값 찾기
		int max = maxOf(height);
		
		// 출력
		System.out.println("가장 큰 키는 " +max+ "cm입니다.");

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
	
	
	static int maxOf(int[] numArr) {
		int max = numArr[0];
		for (int i = 1; i < numArr.length; i++) {
			if (numArr[i] > max) {
				max = numArr[i];
			}
		}
		return max;
	}
	
	

}
