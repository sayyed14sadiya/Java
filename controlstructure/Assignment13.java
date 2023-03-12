package controlstructure;
import java.lang.Math;
public class Assignment13 {
public static void main(String[] args) {
	int num=371;
	int temp=num;
	int sum=0;
	String s=Integer.toString((int) num); 
	double len=s.length();
	while(num>0) {
		double x=num%10;
		sum=(int) (sum + Math.pow(x,len));
		System.out.println(sum);
		num=num/10;
	}
	if(sum==temp) {
		System.out.println(temp+" is an Armstrong number");
	}
	else {
		System.out.println(temp+" is not an Armstrong number");
	}
}
}
