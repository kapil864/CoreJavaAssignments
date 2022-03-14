package question1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Question1 {
	static void countNunberString(String[] str) {
		int number = 0;
		int strin = 0;
		Pattern noPattern = Pattern.compile("[0-9]");
		Pattern strPattern = Pattern.compile("[a-zA-Z]");
		for (String string : str) {
			Matcher matcherNo = noPattern.matcher(string);
			Matcher matcherStr = strPattern.matcher(string);
			if (matcherNo.find()) {
				number++;
			} else if (matcherStr.find()) {
				strin++;
			}
		}
		System.out.println("Numbers are " + number);
		System.out.println("String are " + strin);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter string: ");
		String[] s = (br.readLine()).split(" ");
		countNunberString(s);
		br.close();

	}
}
