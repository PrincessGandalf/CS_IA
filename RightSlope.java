

public class RightSlope extends Mountain implements Lifts {
	private int numTrails;
	//private String trailName;
	private String difficulty;
	private int numSeats;
	private String condition;


	public RightSlope(String n, int s, String l, int t, String d, int ns, String c) {
		super(n, s, l);
		numTrails = t;
		//trailName = tn;
		difficulty = d;
		numSeats = ns;
		condition = c;
	}


	@Override
	public String getDiff() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setDiff(String d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getTrail() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getNumP() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setNumP(int p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getNumT() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setNumT(int t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getConditions() {
		// TODO Auto-generated method stub
		return null;
	}

}
