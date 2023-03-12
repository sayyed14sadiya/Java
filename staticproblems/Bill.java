package staticproblems;


class Bill{
	public static void main(String[] args) {

		Exercise bill1 = new Exercise("DebitCard" );
		Exercise bill2 = new Exercise("PayPal");

		// Create more objects and add them to the bills array for testing your code

		Exercise[] bills = { bill1, bill2 };

		for (Exercise bill : bills) {
			System.out.println("Bill Details");
			System.out.println("Bill Id: " + bill.getBillId());
			System.out.println("Payment method: " + bill.getPaymentMode());
			System.out.println();
		}
	}
}
