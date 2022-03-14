package question7;

import java.util.ArrayList;

public class Question7 {
	
	static ArrayList<String> ans = new ArrayList<String>();
	
	static void swap(char first, char second) {
		char temp = first;
		first = second;
		second = temp;
	}

	static ArrayList<String> utility(char[] ch, int idx) {
		
		if(idx == ch.length) {
			ans.add(ch.toString());
			return ans;
		}
		
		
		for (int i = idx; i < ch.length; i++) {
			

			if ( i!=idx  && ch[i]==ch[idx]) {
				continue;
			}			
			swap(ch[i],ch[idx]);
			utility(ch, idx+1);
			swap(ch[i],ch[idx]);
		}
	}

	static String[] getCombinations(String str) {
		char[] ch = str.toCharArray();
		String[] ans = (utility(ch,0)).toArray(null);
		return ans;
	}
	
	public static void main(String[] args) {
		
		
	}
}
