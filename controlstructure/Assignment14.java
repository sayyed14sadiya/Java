package controlstructure;

public class Assignment14 {
	public static void main(String[] args) {
		int num=1623;
		int sum=0;
		String s=Integer.toString(num);
		int a=s.length();
		int i;
		for(i=1;i<=a;i+=2) {
			//char m=s.charAt(i);
			//System.out.println(m);
			int x=Integer.parseInt(s.substring(i, i+1));
			sum=sum+(x*x);
			
		}
		//char charAt = s.charAt(i);
		//String substring = s.substring(i, i+1);
		if(sum%9==0) {
		System.out.println("The number "+num+" is a lucky number");
		}
		else {
			System.out.println("The number "+num+" is not a lucky number");
		}
	}

}
