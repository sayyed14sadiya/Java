package controlstructure;
public class Assignment4 {
	public static void main(String[] args) {
		int totalCost;
		int qty=2;
		int distance=3;
		char foodType='N';
		int cost;
		if(foodType=='N'){
		cost=15;
		}
		else{
		cost=12;
		}
		totalCost=cost*qty;
		if(distance<=3){
		System.out.println(totalCost);
		}
		else if(distance>3 && distance<=6){
		System.out.println(totalCost+1);
		}
		else
		{
		System.out.println(totalCost+2);
		}
	}

}
