
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
		return difficulty;
	}

	@Override
	public void setDiff(String d) {
		// TODO Auto-generated method stub
		difficulty = d;
		
	}

	@Override
	public int getNumP() {
		// TODO Auto-generated method stub
		return numSeats;
	}

	@Override
	public void setNumP(int p) {
		// TODO Auto-generated method stub
		numSeats = p;		
	}

	@Override
	public int getNumT() {
		// TODO Auto-generated method stub
		return numTrails;
	}

	@Override
	public void setNumT(int t) {
		// TODO Auto-generated method stub
		numTrails = t;
		
	}

	@Override
	public String getConditions() {
		// TODO Auto-generated method stub
		return condition;
	}
	
	public void printAttributes() {
		System.out.println("The difficulty level of the left slope services Experts.");
		System.out.println("The employee working this lift is " + this.getName() + ".");
		System.out.println("The lift on this slope is called " + this.getLift() + " and each chair holds " + 
				(this.getNumP()==1?"1 person.":(this.getNumP() + "people.")));
		System.out.println("There are " + this.getNumT() + " trails serviced from this lift.");
		System.out.println("The condition of the snow is " + this.getConditions() + ".");
		;
	}

}
