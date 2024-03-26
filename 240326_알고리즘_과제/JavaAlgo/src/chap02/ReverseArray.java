package chap02;

public class ReverseArray {

	public static void main(String[] args) {
		int[] numArr = {0, 1, 2, 3, 4};
		
		// 배열 역순 정렬
		reverseArray(numArr);
		
		// 배열 출력
		displayArray(numArr);

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
		for (int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i] + " ");
		}
		System.out.println();
	}

}
