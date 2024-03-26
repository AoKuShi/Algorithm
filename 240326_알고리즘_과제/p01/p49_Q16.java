package p01;

import java.util.Scanner;

public class  p49_Q16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
			
			for (int j = num; j > i; j--) {
				
				System.out.print(" ");
			}
			
			
			for (int j = 1; j < i+1; j++) {
				
				System.out.print(i);
			}
			
			for (int j = 1; j < i; j++) {
				
				System.out.print(i);
			}
			
			System.out.println();
			
		}
		sc.close();

	}

}
