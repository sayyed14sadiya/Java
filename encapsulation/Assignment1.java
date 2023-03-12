package encapsulation;

class Order1 {
	private int orderId;
	private String orderedFood;
	private double totalPrice;
	private String status;
	
	public void setorderId(int orderId) {
		this.orderId=orderId;
	}
	
	public int getorderId() {
		return orderId;
	}
	
	public void setorderedFood(String orderedFood) {
		this.orderedFood=orderedFood;
	}
	
	public String getorderedFood() {
		return orderedFood;
	}
	
	public void settotalPrice(double totalPrice) {
		this.totalPrice=totalPrice;
	}
	public void setstatus(String status) {
		this.status=status;
	}
	
	public String getstatus() {
		return status;
	}
	
	public double calTotalPrice(int unitPrice) {
		totalPrice=totalPrice+(totalPrice*0.05);
		return totalPrice;
}

}
public class Assignment1{
	public static void main(String[] args) {
		Order1 obj=new Order1();
		obj.setorderId(101);
		obj.setorderedFood("Spinach Alfredo Pasta");
		obj.setstatus("Ordered");
		obj.settotalPrice(30);
		
		System.out.println("Order Details");
		System.out.println("Order Id :"+obj.getorderId());
		System.out.println("Ordered Food :"+obj.getorderedFood());
		System.out.println("Order Status :"+obj.getstatus());
		
		double price=obj.calTotalPrice(30);
		System.out.println("Total Price :"+price);
	}
	
}