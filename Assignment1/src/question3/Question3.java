package question3;

import java.util.Scanner;

public class Question3 {

	static double calInterest(int amt) {
		double rate;
		if (amt > 5000) {
			rate = 5;
		} else if (amt > 1000) {
			rate = 4.5;
		} else {
			rate = 4;
		}
		return amt*(rate/100);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter deposit amount");
		int deposit = sc.nextInt();
		System.out.printf("The amount of interst per year : %.2f", calInterest(deposit));
		sc.close();
	}

}
