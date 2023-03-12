package staticproblems;

class Order {
	private static int orderIdCounter;
	private int orderId;
	private Food[] orderedFoods;
	private double totalPrice;
	private String status;

	static {
		orderIdCounter = 100;
	}

	Order() {
		System.out.println("Status of order : Ordered");
	}

	public Order(Food[] orderedFoods) {
		this.orderedFoods = orderedFoods;
		this.orderId = ++orderIdCounter;
	}

	public static int getTotalNoOfOrders() {
		return Order.orderIdCounter - 100;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public Food[] getOrderedFoods() {
		return orderedFoods;
	}

	public void setOrderedFoods(Food[] orderedFoods) {
		this.orderedFoods = orderedFoods;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double calculateTotalPrice(String paymentMode) {
		double foodCost=0;
		double finalPrice=0;
		float serviceCharger=0f;
		for(Food food:orderedFoods) {
			foodCost+=food.getFoodPrice();
		}
		if(paymentMode.equals("Credit Card")||paymentMode.equals("Debit Card")) {
			serviceCharger=2.0f;
		}
		else if(paymentMode.equals("PayPal")) {
			serviceCharger=2.9f;
		}
		finalPrice=foodCost+foodCost*(serviceCharger/100);
		this.setTotalPrice(finalPrice);
		return finalPrice;
	}
}

class Food {
	private String foodName;
	private int foodQty;
	private int foodPrice;

	public Food(String foodName, int foodQty, int foodPrice) {
		this.foodName = foodName;
		this.foodQty = foodQty;
		this.foodPrice = foodPrice;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public int getFoodQty() {
		return foodQty;
	}

	public void setFoodQty(int foodQty) {
		this.foodQty = foodQty;
	}

	public int getFoodPrice() {
		return foodPrice;
	}

	public void setFoodPrice(int foodPrice) {
		this.foodPrice = foodPrice;
	}
}

public class Assignment1 {
	public static void main(String[] args) {
		Food obj1 = new Food("Noodles", 2, 20);
		Food obj2 = new Food("Rice", 2, 10);
		Food obj3 = new Food("Soup", 1, 10);

		Food[] arr = { obj1, obj2, obj3 };

		Order objOrder = new Order(arr);
		System.out.println(objOrder.calculateTotalPrice("PayPal"));
		
		int num=Order.getTotalNoOfOrders();
		System.out.println(num);
	}
}