package Question4;

import java.util.Scanner;

public class question4 {
	
	static double calTax(int gp) {
		
		double taxp;
		if(gp <= 240) {
			taxp =0;
		}
		else if(gp < 480 ) {
			taxp = 15;
		}
		else {
			taxp = 28;
		}
		return gp*(taxp/100);
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter gross pay");
		int gp = sc.nextInt();
		System.out.printf("The amount of tax : %.2f", calTax(gp));
		sc.close();
		
	}

}
