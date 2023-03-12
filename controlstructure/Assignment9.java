package controlstructure;

public class Assignment9 {
public static void main(String[] args) {
	int num=1331;
	int temp=num;
	int sum=0;
	while(num>0) {
		int r=num%10;
		sum=(sum*10)+r;
		num=num/10;
	}
	if(temp==sum) {
		System.out.println("It is a Palindrome");
	}
	else {
		System.out.println("It is not a Palindrome");
	}
}
}
