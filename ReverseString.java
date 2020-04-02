package learnstring;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		String x="TestLeaf";
		
		char[] charArray = x.toCharArray();
		
		String reverse=" ";
		
		for(int y=x.length()-1;y>=0;y--){
			
			reverse=reverse+charArray[y];
		}
		
		System.out.println(reverse);
		
		}
	}

	
		
