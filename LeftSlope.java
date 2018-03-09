
public class LeftSlope extends Mountain implements Lifts {
	private int numTrails;
	private String trailName;
	private String difficulty;
	private int numSeats;
	private String condition;
	
	public LeftSlope() {
		super();
		numTrails = 0;
		trailName = "";
		difficulty = "";
		numSeats = 0;
		condition = "";
	}


	public String getDiff() {
		return difficulty;
	}

	public void setDiff(String d) {
		difficulty = d;
	}

	public String getTrail() {
		return trailName;
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
	
	

}
