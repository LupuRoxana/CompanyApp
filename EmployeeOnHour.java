package Company;

public class EmployeeOnHour extends Employee {

	private int hour;
	private double sumPerHour;
	public EmployeeOnHour(String name, String code, double sumPerHour, int hour) {
		
		super(name, code);
		this.hour = hour;
		this.sumPerHour = sumPerHour;
		// TODO Auto-generated constructor stub
	}
	
	public double getSum() {
		
		return hour*sumPerHour;
		
	}
	
	public String toString() {
		
		return "Employee on hour:" + super.toString() + getSum();
	}

}
