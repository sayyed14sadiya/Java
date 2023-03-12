package encapsulation;

class MovieTicketSol {
	private int movieId;
	private int noOfSeats;
	private double costPerTicket;

	MovieTicketSol(int movieId, int noOfSeats) {
		this.movieId = movieId;
		this.noOfSeats = noOfSeats;
	}

	public double calculateTotalAmount() {
		double totalAmount = costPerTicket * noOfSeats;
		System.out.println(costPerTicket);
		totalAmount = totalAmount + totalAmount * 0.02;
		return totalAmount;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public int getnoOfSeats() {
		return noOfSeats;
	}

	public void setnoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	public double getCostPerTicket() {
		return getCostPerTicket();
	}

	public void setCostPerTicket(double costPerTicket) {
		this.costPerTicket = costPerTicket;

	}
}

public class MovieTicket {
	public static void main(String[] args) {
		MovieTicketSol movieTicket = new MovieTicketSol(112, 3);
		
		
		int movieId = movieTicket.getMovieId();
		
		if (movieId == 111) {
			movieTicket.setCostPerTicket(7.0);
		} else if (movieId == 112) {
			movieTicket.setCostPerTicket(8.0);
		} else {
			movieTicket.setCostPerTicket(8.5);
		}

		double amount = movieTicket.calculateTotalAmount();

		System.out.println(movieTicket.getMovieId());

		if (amount == 0)
			System.out.println("Sorry! Please enter valid movie Id and number of seats");
		else
			System.out.println("Total amount for booking : $" + amount);
	}
}
