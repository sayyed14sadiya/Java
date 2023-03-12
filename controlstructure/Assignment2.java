package controlstructure;

public class Assignment2 {
	public static void main(String[] args) {
		int a=1;
		int b=4;
		int c=4;
		double d;
		d=(b*b)-4*(a*c);
		double x1=(-b + d)/2*a;
		double x2=(-b - d)/2*a;
		if(d==0){
		System.out.println("The root is" + x1 +x2);
		}
		else if(d>0){
		System.out.println("The root is" + x1 +x2);
		}
		else{
		System.out.println("The requation has no real root");
		}
	}

}
