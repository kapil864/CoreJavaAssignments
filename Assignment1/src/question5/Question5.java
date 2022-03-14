package question5;

import java.util.Scanner;

public class Question5 {

	static boolean isPrimeNumber(int num) {
		int i = num - 1;
		while (i > 1) {
			if (num % i == 0) {
				return false;
			}
			i--;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int no = sc.nextInt();
		if (Question5.isPrimeNumber(no)) {
			System.out.println("Is prime.");
		} else {
			System.out.println("Is not prime.");
		}
		sc.close();

	}

}
