package question6;

import java.util.Scanner;

public class Question6 {

	static int[] findPrime(int ed) {
		int[] arr = new int[ed + 1];
		for (int i = 2; i <= ed; i++) {
			for (int j = i * i; j <= ed; j += i) {
				if (arr[j] == 0) {
					arr[j] = 1;
				}
			}
		}
		return arr;

	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter range : ");
		int st = sc.nextInt();
		int ed = sc.nextInt();
		int arr[] = findPrime(ed);
		for(int i =st;i<arr.length;i++) {
			if(arr[i]!=1) {
				System.out.print(i+" ");
			}
		}
		sc.close();

	}
}
