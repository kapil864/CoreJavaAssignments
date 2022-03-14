package question5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question5 {
	static String replaceString(String line, String word, String source) {
		
		StringBuilder res = new StringBuilder();
		String s[] = line.split(" ");
		for (String string : s) {
			StringBuilder sb = new StringBuilder(string);
			if((sb.toString()).equals(word)) {
				sb.replace(0, sb.length(), source);
			}
			
			res.append(sb);
			res.append(" ");
		}
		return res.toString();
	}
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter string ");
		String line = br.readLine();
		
		System.out.println("Enter word to be replaced ");
		String word = br.readLine();
		
		System.out.println("Enter new word");
		String source = br.readLine();
		
		System.out.println("Modifed string \n"+replaceString(line,word,source));
	}
}
