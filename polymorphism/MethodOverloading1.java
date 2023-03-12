package polymorphism;

class Point{
	private double xCoordinate;
	private double yCoordinate;
	
	public Point(double xCoordinate, double yCoordinate) {
		
		this.xCoordinate = xCoordinate;
		this.yCoordinate = yCoordinate;
	}
	
	public double calculateDistance(){
		double distance;
		double a=(this.xCoordinate*this.xCoordinate)+(this.yCoordinate*this.yCoordinate);
		distance=Math.sqrt(a);
		return Math.round(distance*100)/100;
		
	}
	
	public double calculateDistance(Point point) {
		double distance;
		double a=(this.xCoordinate-point.getxCoordinate())*(this.xCoordinate-point.getxCoordinate())+(this.yCoordinate-point.getyCoordinate())*(this.yCoordinate-point.getyCoordinate());
		distance=Math.sqrt(a);
		return distance;
	}

	public double getxCoordinate() {
		return xCoordinate;
	}

	public void setxCoordinate(double xCoordinate) {
		this.xCoordinate = xCoordinate;
	}

	public double getyCoordinate() {
		return yCoordinate;
	}

	public void setyCoordinate(double yCoordinate) {
		this.yCoordinate = yCoordinate;
	}
	
	
}

public class MethodOverloading1 {
	public static void main(String[] args) {
		Point point1 = new Point(3.5, 1.5);
        Point point2 = new Point(6, 4);
                                
        System.out.println("Distance of point1 from origin is "+point1.calculateDistance());
        System.out.println("Distance of point2 from origin is "+point2.calculateDistance());
        System.out.println("Distance of point1 from point2 is "+point1.calculateDistance(point2));
        
        //Create more objects for testing your code                

	}
}
