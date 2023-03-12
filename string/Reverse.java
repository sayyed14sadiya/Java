package string;

public class Reverse {
	public String reverseWord(String str) {
		String[] rev=str.split(" ");
		String reverseWordString="";
		for(String s:rev) {
		//	System.out.println(s);
			StringBuilder reversedString=new StringBuilder(s);
			reversedString.reverse();
			reverseWordString=reverseWordString+" "+reversedString;
		}
		return reverseWordString;
	}
}
