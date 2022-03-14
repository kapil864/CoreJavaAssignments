package question2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question2 {
	
	static String[] initProductNames() {
		String[] products = { "apple", "laptop", "iphone","asus","rog","pog","macBook"};
		return products;
		
	}
	
	static boolean isPresent(String[] productNames, String keyword) {
		for (String string : productNames) {
			if(string.equalsIgnoreCase(keyword)) {
				return true;
			}
		}
		return false;
		
	}

	public static void main(String[] args) throws IOException{
		
		BufferedReader br   =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter keyword: ");
		String s = br.readLine();
		String[] product = initProductNames();
		if(isPresent(product, s)) {
			System.out.println("Product available ");
		}
		else {
			System.out.println("Product not available ");
		}
		
	}

}
