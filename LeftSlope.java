

public class LeftSlope extends Mountain implements Lifts {
	private int numTrails;
	//private String trailName;
	private String difficulty;
	private int numSeats;
	private String condition;
	
	
	public LeftSlope(String n, double s, String l, int t, String d, int ns, String c) {
		super(n, s, l);
		numTrails = t;
		//trailName = tn;
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

	@Override
	public String getTrail() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
