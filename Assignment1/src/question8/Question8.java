package question8;

import java.util.Scanner;

public class Question8 {

	static double calculateBill(String connectionType, int consumedUnits) {

		if (connectionType.equals("domestic")) {
			if (consumedUnits <= 100) {
				return 4 * consumedUnits > 250 ? 4 * consumedUnits : 250;
			} else if (consumedUnits <= 300) {
				return 4.5 * consumedUnits;
			} else if (consumedUnits <= 500) {
				return 4.75 * consumedUnits;
			} else {
				return 5 * consumedUnits;
			}
		}

		else if (connectionType.equals("commercial")) {
			if (consumedUnits <= 100) {
				return 4.25 * consumedUnits > 350 ? 4.25 * consumedUnits : 350;
			} else if (consumedUnits <= 300) {
				return 4.75 * consumedUnits;
			} else if (consumedUnits <= 500) {
				return 5 * consumedUnits;
			} else {
				return 5.25 * consumedUnits;
			}

		}
		return 0;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter connection type : ");
		String s = sc.next().toLowerCase();
		System.out.println("Enter unit : ");
		int no = sc.nextInt();
		System.out.println("Electricity bill is " + calculateBill(s, no));
		sc.close();
	}

}
