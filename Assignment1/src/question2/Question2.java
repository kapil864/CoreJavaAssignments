package question2;

import java.util.Scanner;

public class Question2 {
	
	static boolean checkAlpha(char alph) {
		if(alph=='a' || alph=='e' || alph =='i' || alph =='o' || alph=='u') {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a charcter: ");
		String s = sc.next();
		s = s.toLowerCase();
		char ch = s.charAt(0);
		if(Question2.checkAlpha(ch)) {
			System.out.println("Character is vowel.");
		}
		else {
			System.out.println("Character is not vowel");
		}
		sc.close();
	}
}
