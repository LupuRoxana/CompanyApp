package Company;

public abstract class Employee {

	private String name;
	private String code;
	
	public Employee(String name, String code) {
		
		this.name = name;
		this.code = code;
	
	}
	
	public abstract double getSum();
	
	public boolean equals(Object o) {
		
		return (o instanceof Employee) && (((Employee)o).name).equals(name) && (((Employee)o).code).equals(code);

	}
	
	public String toString() {
		
		return name + "" + code;
	
	}
	
	public String getName() {
		
		return name;
	
	}
	
}
