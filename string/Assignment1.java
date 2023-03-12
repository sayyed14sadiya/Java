package string;

class Assignment {
	public String moveSpecialCharacters(String str) {
		String regex="[a-zA-Z0-1]";
		String s1 = "";
		String s2="";
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			
			if(String.valueOf(ch).matches(regex)) {
				s1=s1+ch;
			}
			else {
				s2=s2+ch;
			}
			
		}
		return s1+s2;
	}

}
class Assignment1{
	public static void main(String[] args) {
		Assignment obj=new Assignment();
		String str="He@#$llo!*&";
		String s=obj.moveSpecialCharacters(str);
		System.out.println(s);
	}
}
