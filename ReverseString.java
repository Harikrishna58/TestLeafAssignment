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

	
		/*System.out.println("Enter string to Reverse :");
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		String reverse="";
		for(int x=st.length()-1;x>=0;x--){
			reverse=reverse+st.charAt(x);
		}
System.out.println("Reversed string is");
System.out.println(reverse);
	}*/
