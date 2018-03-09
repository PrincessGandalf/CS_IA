
public class Tickets {
	
	private double childRate = 0;
	private double adultRate = 0;
	private int days = 0;
	private double totCost = 0;

	public Tickets() {
		childRate = 0;
		adultRate = 0;
		days = 0;	
	}
	
	public Tickets(double r, double a, int d) {
		childRate = r;
		adultRate = a;
		days = d;
	}
	
	public double getTotCost() {
		return totCost;
	}

	public void setTotCost(double totCost) {
		this.totCost = totCost;
	}

	public void setDays(int da) {
		this.days = da;
	}
	
	public int getDays() {
		return days;
	}
	
	public double calcTicCost(double age, double child, double adult) {
		double cost = 0;
		if(age > 13) {
			cost = adult * days;
		} else {
			cost = child * days;
		}
		this.setTotCost(cost);
		return cost;
	}
}
