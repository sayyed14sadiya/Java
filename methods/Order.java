package methods;

class Order1 {
	public int orderId;
	public String orderedFood;
	public double totalPrice;
	public String status;
	
public double calTotalPrice(int unitPrice) {
	totalPrice=totalPrice+(totalPrice*0.05);
	return totalPrice;
}

}
public class Order{
	public static void main(String[] args) {
		Order1 obj=new Order1();
		obj.orderId=101;
		obj.orderedFood="Spinach Alfredo Pasta";
		obj.status="Ordered";
		obj.totalPrice=30;
		
		System.out.println("Order Details");
		System.out.println("Order Id :"+obj.orderId);
		System.out.println("Ordered Food :"+obj.orderedFood);
		System.out.println("Order Status :"+obj.status);
		
		double price=obj.calTotalPrice(30);
		System.out.println("Total Price :"+price);
	}
	
}

