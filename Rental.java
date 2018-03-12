import java.util.ArrayList;

public class Rental extends Skier {
	private double radius;
	private double rate;
	private String type;
	
	public Rental() {
		super();
		radius = 0;
		rate = 0;
		type = "";
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
	
	public ArrayList<String> getSki(double radius, String condition, String level) {
		ArrayList<String> skiTypes = new ArrayList<String>();
		if(radius <= 12 && radius >= 10) {
			skiTypes.clear();
			skiTypes.add("Slalom");
		} else if ((radius <= 14 && radius >= 20)) {
			if(level.compareTo("Beginner") == 0) {
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
			if(level.compareTo("Beginner") == 0) {
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
			skiTypes.clear();
			skiTypes.add("Super-G");
			skiTypes.add("Downhill");
		}	
		return skiTypes;
	}

}
