package question6;

import java.util.Scanner;

public class Question6 {

	void printPrime(int maxVal) {
		int[] arr = new int[maxVal + 1];
		for (int i = 2; i <= maxVal; i++) {
			for (int j = i * i; j <= maxVal; j += i) {
				if (arr[j] == 0) {
					arr[j] = 1;
				}
			}
		}

		for (int i = 1; i <= maxVal; i++) {
			if (arr[i] != 1) {
				System.out.print(i + " ");
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int no = sc.nextInt();
		Question6 question6 = new Question6();
		question6.printPrime(no);
		sc.close();
	}

}
