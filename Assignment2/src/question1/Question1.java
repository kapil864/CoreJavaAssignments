package question1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question1 {
	
	static int check(String sentence,String word){
		int occ=0;
		String[] res = sentence.split(" ");
		for (String string : res) {
			if(string.equals(word)) {
				occ++;
			}
		}
		return occ;
	}
	public static void main(String[] args) throws Exception{
		BufferedReader br   =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter string: ");
		String s = br.readLine();
		System.out.println("Enter word to count");
		String word = br.readLine();
		System.out.println("The occurance of "+word+" is : "+(check(s,word)));
		br.close();	
	}
}
