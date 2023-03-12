package controlstructure;

public class Assignment12 {
	public static void main(String[] args) {
	int num1=123;
	int temp=num1;
	int num2=738;
	int mul=num1;
	while(num1>0) {
		int m=num1%10;
		mul=mul*m;
		num1=num1/10;
	}
	if(mul==num2) {
		System.out.println(temp+" is a seed of "+num2);
	}
	else {
		System.out.println(num1+" is not a seed of "+num2);
	}
}
}