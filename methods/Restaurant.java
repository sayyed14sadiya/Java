package methods;

class Restaurant1 {
	public String resName;
	public long resContact;
	public String resAddress;
	public float rating;
	
public void displayDetails(String name,long con,String add,float rate) {
	System.out.println("Restaurant Details");
	System.out.println("Restaurant Name :"+name);
	System.out.println("Restaurant rating :"+rate);
	System.out.println("Restaurant Contact :"+con);
	System.out.println("Restaurant Address :"+add);
}
}
public class Restaurant{
	public static void main(String[] args) {
		Restaurant1 obj=new Restaurant1();
		obj.displayDetails("McDonald's", 99886767, "Carolina Street", (float) 4.1);
	}
}
