package methods;

class Rectangle {
	public float length;
	public float width;
	public double calculateArea(float len,float wid) {
	double area=len*wid;
	return area;
	}
	public double calculatePerimeter(float len,float wid) {
	double perimeter=2*(len+wid);
	return perimeter;
	}
}
public class Assignment4{
	public static void main(String[] args) {
		Rectangle obj=new Rectangle();
		obj.length=12f;
		obj.width=5f;
		double area1=obj.calculateArea(obj.length,obj.width);
		double perimeter1=obj.calculatePerimeter(obj.length,obj.width);
		System.out.println("The area of rectangle is "+area1);
		System.out.println("The perimeter of rectangle is "+perimeter1);
	}
}