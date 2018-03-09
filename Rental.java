
import java.util.ArrayList;

public class Rental extends Skier {
	private double radius;
	private double rate;
	private String type;
	private ArrayList<String> skiTypes;
	
	public Rental() {
		super();
		radius = 0;
		rate = 0;
		type = "";
		skiTypes = new ArrayList<String>();
	}
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public void getSki(double radius, String condition) {
		if(radius <= 12 && radius >= 10) {
			skiTypes.add("Slalom");
		} else if ((radius <= 14 && radius >= 20)) {
			if(super.getLevel().compareTo("Beginner") == 0) {
				skiTypes.clear();
				skiTypes.add("Beginner");
			} else if (condition.compareTo("Powder") == 0) {
				skiTypes.clear();
				skiTypes.add("Powder");
			} else {
				skiTypes.clear();
				skiTypes.add("Allaround");
				skiTypes.add("Freestyle");
			}
		} else if(radius >= 20 && radius <= 30) {
			if(super.getLevel().compareTo("Beginner") == 0) {
				skiTypes.clear();
				skiTypes.add("Beginner");
			} else if (condition.compareTo("Powder") == 0) {
				skiTypes.clear();
				skiTypes.add("Powder");
			} else {
				skiTypes.clear();
				skiTypes.add("Giant Slalom");
			}
		} else {
			
		}
	}

}

