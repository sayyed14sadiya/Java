package methods;

class Orders {
	public int orderId;
	public String orderedFood;

	Orders() {
		System.out.println("Status of order : Ordered");
	}

	Orders(int orderId, String orderedFood) {
		this.orderId=orderId;
		this.orderedFood=orderedFood;
	}
}

public class Constructor1 {
	public static void main(String[] args) {
		Orders obj = new Orders();
		Orders obj1 = new Orders(1001, "Pizza");
	//	obj.orderId=1000;
	//	obj.orderedFood="Pasta";
		System.out.println(obj.orderId);
		System.out.println(obj.orderedFood);
		System.out.println(obj1.orderId);
		System.out.println(obj1.orderedFood);

	}

}
