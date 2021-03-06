import java.util.Random;

public class CheckIn {
	
	private int numNights;
	private double rate;
	private String creditcard;
	private String name;
	private int numGuest;
	
	

	public CheckIn() {
		numNights = 0;
		rate = 0.0;
		setCreditcard("");
		setNumGuest(0);
		
	}
	
	public CheckIn(int n, double r, String cc, String na, int g) {
		numNights = n;
		rate = r;
		creditcard = cc;
		name = na;
		numGuest = g;	
	}


	public int getNumNights() {
		return numNights;
	}


	public void setNumNights(int numNights) {
		this.numNights = numNights;
	}


	public double getRate() {
		return rate;
	}


	public void setRate(double rate) {
		this.rate = rate;
	}

	public String getCreditcard() {
		return creditcard;
	}

	public void setCreditcard(String creditcard) {
		this.creditcard = creditcard;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		name = name;
	}

	public int getNumGuest() {
		return numGuest;
	}

	public void setNumGuest(int numGuest) {
		this.numGuest = numGuest;
	}
	
	public double calcRate() {
		return getNumNights() * getRate() * getNumGuest();
	}
	
	public void creditClassify() {
		int key = 17;
		Random random = new Random(30);
		System.out.println("Contacting bank...");
		if(random.nextInt() == key) {
			System.out.println("Card rejected. Please choose another payment method.");
			System.out.println("What is your new credit card number?");
		} else {
			System.out.println("Credit Card Accepted!");
		}	
	}

}
