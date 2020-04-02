package learnstring;

public class NextCharacter {

	public static void main(String[] args) {
	
		String input="A1B2C3";
		char[] charArray = input.toCharArray();
String x = "";
String y= "";
String z= "";
String a= "";
int m=0;
String k ="";
String reverse = "";
for (int i = 0; i <=input.length()-1; i=i+2) {
	x=x+charArray[i];
	//System.out.println(x);
	
}
for (int i = 0; i <input.length()-1; i=i+2) {
	y=y+charArray[i];
	//System.out.println(y);
}
for (int i = 0; i <=x.length()-1; i++) {
	for (int j = 0; j<= i; j++) {
		char charAt = x.charAt(i);
		int ascii=charAt;
		int d=ascii+1;
		z=z+Character.toString((char)d);
		m=j+2;
		a=a+m;
		k=z+a;
		
	}}
for (int i = 0; i < k.length(); i=i+3) {
	reverse =reverse+k.charAt(i);
	}
for (int j = 1; j < k.length(); j=j+3) {
	reverse=reverse+k.charAt(j);
	
}
for (int l = 2; l < k.length(); l=l+3) {
	reverse=reverse+k.charAt(l);
	
}
System.out.println(reverse);
	}

}
