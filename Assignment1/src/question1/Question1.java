package question1;

import java.util.Scanner;

public class Question1 {

	public static int calMax(int a, int b, int c) {
		if (a > b && a > c) {
			return a;
		} else if (b > c) {
			return b;
		}
		return c;
	}

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println("Maximum number is : " + (Question1.calMax(a, b, c)));
		sc.close();
	}
}

