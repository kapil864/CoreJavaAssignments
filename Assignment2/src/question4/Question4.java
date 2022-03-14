package question4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question4 {
	static String makeReverse(String str) {
		
		StringBuilder res = new StringBuilder();
		String s[] = str.split(" ");
		for (String string : s) {
			StringBuilder sb = new StringBuilder(string);
			res.append(sb.reverse());
			res.append(" ");
		}
		return res.toString();
		
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter string ");
		String s = br.readLine();
		System.out.println(makeReverse(s));
		br.close();
	}

}
