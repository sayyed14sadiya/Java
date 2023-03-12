package controlstructure;


public class Exercise_2 {
public static void main(String[] args) {
	int sum=1;
	int i;
	for(i=1;i<=5;i++){
		if(i==1) {
			System.out.print(sum+",");
		}
		else{
			sum=sum*2;
			System.out.print(sum+",");
		}
	}
}
}