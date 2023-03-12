package string;

class Assign{
	public String checkPalindrome(String str) {
		String s2 = "";

		for (int j = str.length()-1; j >=0; j--) {
			char ch = str.charAt(j);
			s2 = s2 + ch;
			System.out.println(s2);
		}
		return s2;
	}
}

public class Assignment2
{

	public static void main(String[] args) {
		Assign obj=new Assign();
		String str="radar";
		String s=obj.checkPalindrome(str);
		if(s.equals(str)) {
			System.out.println("Given string is palindrome");
		}
		else {
			System.out.println("Given string is not palindrome");
		}
	}
}