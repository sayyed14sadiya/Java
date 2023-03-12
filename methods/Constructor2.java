package methods;

class Restaurants{
	public String resName;
	public long resContact;
	public String resAddress;
	public float rating;
	
	Restaurants(String resname,long resContact,String resAddress,float rating){
		this.resName=resname;
		this.resContact=resContact;
		this.resAddress=resAddress;
		this.rating=rating;
		//this.displayDetails();
	}
	public void displayDetails(){
		System.out.println("Restaurant Details");
		System.out.println("Restaurant Name :"+resName);
		System.out.println("Restaurant Rating :"+rating);
		System.out.println("Restaurant contact :"+resContact);
		System.out.println("Restaurant Adress :"+resAddress);
	}
	
}
public class Constructor2 {
	public static void main(String[] args) {
		Restaurants obj=new Restaurants("McDonalds", 98989898,"D089,St.Louis Street,Springfield", 4.1f);
		obj.displayDetails();
	}

}
