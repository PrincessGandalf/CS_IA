
public class LeftSlope extends Mountain implements Lifts {
	private int numTrails;
	//private String trailName;
	private String difficulty;
	private int numSeats;
	private String condition;
	
	
	public LeftSlope(String n, double s, String l, int t, String d, int ns, String c) {
		super(n, s, l);
		numTrails = t;
		difficulty = d;
		numSeats = ns;
		condition = c;
	}


	public String getDiff() {
		return difficulty;
	}

	public void setDiff(String d) {
		difficulty = d;
	}

	public int getNumP() {
		return numSeats;
	}

	public void setNumP(int p) {
		numSeats = p;
	}

	public int getNumT() {
		return numTrails;
	}

	public void setNumT(int t) {
		numTrails = t;
		
	}

	public String getConditions() {
		return condition;
	}

	
	public void printAttributes() {
		System.out.println("The difficulty level of the left slope services Beginners and Intermediates.");
		System.out.println("The employee working this lift is " + this.getName() + ".");
		System.out.println("The lift on this slope is called " + this.getLift() + " and each chair holds " + 
				(this.getNumP()>0?"1 person.":(this.getNumP() + "people.")));
		System.out.println("There are " + this.getNumT() + " trails serviced from this lift.");
		System.out.println("The condition of the snow is " + this.getConditions() + ".");
		;
	}
	

}
