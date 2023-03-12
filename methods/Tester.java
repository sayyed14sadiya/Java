package methods;



public class Tester {
	public static void main(String[] args) {
		Calculator obj = new Calculator();
		double average = obj.findAverage(12, 31, 16);
		System.out.println(average);
		System.out.println(Math.round(average));
		System.out.println(Math.round(average * 100) / 100.0);
	}
}

class Calculator{
	public double findAverage(int num1, int num2, int num3) {
		double avg = (num1 + num2 + num3) / 3.0;
		return avg;

	}
	
}