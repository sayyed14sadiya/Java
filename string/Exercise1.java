package string;

class Exercise {
public String removeWhiteSpaces(String str) {
	String s = str.replace(" ","");
	return s;
	
}

}
public class Exercise1{
	public static void main(String[] args) {
		Exercise obj=new Exercise();
		String string = "Hello   How are you";
		String str =obj.removeWhiteSpaces(string);
		System.out.println(str);
	}
}