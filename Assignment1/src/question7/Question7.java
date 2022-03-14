package question7;

import java.util.Scanner;


public class Question7 {
	
	static float calculateProfit( int numAttendees) {
		return numAttendees*(5-(0.5f))- 20;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of attendies : ");
		int no = sc.nextInt();
		System.out.printf("Total profit %.2f", (calculateProfit(no)));
		sc.close();
	}

}
