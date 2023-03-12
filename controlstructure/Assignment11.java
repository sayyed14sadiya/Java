package controlstructure;

public class Assignment11 {
	public static void main(String[] args) {
		int num=123;
		int temp=num;
		int sum=0;
		while(num>0){
			int r=num%10;
			sum=sum+r;
			num=num/10;
		}
		int r=temp%sum;
		if(r==0) {
			System.out.println(temp+" is divisible by sum of its digit");		
		}
		else {
			System.out.println(temp +" is not divisible by sum of its num");
		}
		
	}

}
