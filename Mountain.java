
public class Mountain {
	private String empName;
	private double empSalary;
	private String lname;
	
	public Mountain() {
		empName = "";
		empSalary = 0;
		lname = "";
	}
	
	public Mountain(String n, double s, String l) {
		empName = n;
		empSalary = s;
		lname = l;
	}
	
	public String getName() {
		return this.empName;
	}
	
	public void setName(String x) {
		this.empName = x;
	}
	
	public double getSal() {
		return this.empSalary;
	}
	
	public void setSal(double y) {
		this.empSalary = y;
	}
	
	public String getLift() {
		return this.lname;
	}
	
	public void setLift(String l) {
		this.lname = l;
	}
	
	
}
