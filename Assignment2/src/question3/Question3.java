package question3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question3 {

	static int findPosition(int num, int[] nos) {
		for (int i = 0; i < nos.length; i++) {
			if (num == nos[i]) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter no of elemnts");
		int size = Integer.parseInt(br.readLine());
		int[] arr = new int[size];
		System.out.println("Enter elemnts");
		for (int i = 0; i < size; i++) {
			int no = Integer.parseInt(br.readLine());
			arr[i] = no;
		}
		System.out.println("Enter no to find : ");
		int no = Integer.parseInt(br.readLine());
		System.out.println("Position of" + no + " is : " + findPosition(no, arr));
		br.close();
	}

}
