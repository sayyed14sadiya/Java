package controlstructure;

public class Assignment8 {
public static void main(String[] args) {
	int num=15;
	if(num%3==0 && num%5==0) {
		System.out.println("Zoom");
	}
	else if(num%5==0) {
		System.out.println("zap");
	}
	else if(num%3==0) {
		System.out.println("zip");
	}
	else {
		System.out.println("Invaild");
	}
}
}
