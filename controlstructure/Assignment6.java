package controlstructure;

public class Assignment6 {
	public static void main(String[] args) {
	int x=2;  //number of 1rs note
	int y=5;  //number of 2rs note
	int amount=21;  
	int result=amount%5;
	if(result==0 && result<y) {
		int requiredFiveNote=amount/5;
		System.out.println("Number of 5RS Note Required is :"+requiredFiveNote);
	}
	else if(result!=0 && result<x) {
		int requiredFiveNote=amount/5;
		System.out.println("Number of 5RS Note Required is :"+requiredFiveNote);
		System.out.println("Number of 1rs Note Required is :"+result);	
	}
	else {
		System.out.println(-1);
	}
	
}
}
