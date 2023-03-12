package classesandobject;

public class Exercise_1 {
	public String foodName ;
	public String cusine;
	public String foodType;
	public int quatityAvailable;
	public double unitPrice;
}

class Tester{
	public static void main(String[] args) {
		Exercise_1 obj =new Exercise_1();
		obj.foodName="Pizza";
		obj.cusine="Italian";
		obj.foodType="veg";
		obj.quatityAvailable=2;
		obj.unitPrice=349;
		                             
	}
}