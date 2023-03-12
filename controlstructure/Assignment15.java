package controlstructure;

public class Assignment15 {
public static void main(String[] args) {
	int num1=5;
	int num2=10;
	int a;
	if(num1<num2) {
		 a =num1;
	}
	else {
		 a=num2;
	}

	int res=num1*num2;
	if(res%a==0){
		res=res/a;
	}
}
}
